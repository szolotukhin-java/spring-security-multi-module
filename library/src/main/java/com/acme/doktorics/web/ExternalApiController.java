package com.acme.doktorics.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExternalApiController {

    @GetMapping("/web-service/external")
    public String externalWebServiceUi() {
        return "External Web services\n\n" +
                "http://localhost:8080/doktorics_war/web-service/external/entity\n" +
                "http://localhost:8080/doktorics_war/web-service/external/schedule\n\n";
    }

    @GetMapping("/web-service/external/entity")
    public String externalEntity() {
        return "entity";
    }

    @GetMapping("/web-service/external/schedule")
    public String externalSchedule() {
        return "schedule";
    }

}
