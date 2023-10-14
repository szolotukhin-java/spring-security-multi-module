package com.acme.doktorics.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "ui";
    }

    // ================================================================================================================
    // Internal Web service
    // ================================================================================================================

    @GetMapping("/web-service/internal")
    public String internalWebServiceUi() {
        return "Internal Web Services\n\n" +
                "http://localhost:8080/doktorics_war/web-service/internal/dirivation\n\n";
    }

    @GetMapping("/web-service/internal/dirivation")
    public String internal() {
        return "derivation";
    }

    // ================================================================================================================
    // External web service
    // ================================================================================================================

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
