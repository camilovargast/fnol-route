package com.tiury.route;

import com.tiury.model.MediatorCsv;
import com.tiury.translator.DeathReportedTranslator;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.BindyType;

import java.time.Instant;

public class FNOLRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        onException(IllegalArgumentException.class)
            .handled(true)
            .log("Mandatory field error -> ${exception.message}")
            .log("Bad Line-> ${body}")
            .log("Record number -> ${exchangeProperty.CamelSplitIndex}")
        ;

        onException(Exception.class)
                //.handled(true)
                .log("***Unexpedted error*** -> ${exception.message}")
                .log("Bad Line-> ${body}")
                .log("Record number -> ${exchangeProperty.CamelSplitIndex}")
        ;

        from("file:mediator-files")
                .routeId("death-reported-mediator-route")
                .log("Ruta->${routeId}")
                .split(body().tokenize("\n"))
                    .streaming()
                    .filter(simple("${exchangeProperty.CamelSplitIndex} > 0"))
                        .setHeader("correlId", simple("${exchangeId}"))
                        .unmarshal()
                        .bindy(BindyType.Csv, MediatorCsv.class)
                        .setHeader("id", simple("${body.txId}"))
                        .setHeader("source", simple("${body.appId}"))
                        .setHeader("time",simple("${date-with-timezone:now:UTC:yyyy-MM-dd'T'HH:mm:ssXXX}"))
                        .bean(DeathReportedTranslator.class, "translate")
                        .to("direct:deathReportedEvent")
                    .end()
                .end()
        ;

        from("direct:deathReportedEvent")
                .routeId("death-reported-main-route")
                .log("Ruta->${routeId}")
                .setHeader("specversion", constant("1.0"))
                .setHeader("type", constant("com.tiury.fnol.death.reported"))
                .log("cloud-events ---> " +
                        "specversion=${headers.specversion}, " +
                        "type=${headers.type}, " +
                        "correlId=${headers.correlId}, " +
                        "id=${headers.id}, " +
                        "source=${headers.source}, " +
                        "time=${headers.time}")
                .log("Event received ---> ${body}")

        ;

    }
}
