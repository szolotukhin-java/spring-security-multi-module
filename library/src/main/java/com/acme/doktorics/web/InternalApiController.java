package com.acme.doktorics.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InternalApiController {

    @GetMapping("/web-service/internal")
    public String internalWebServiceUi() {
        return "Internal Web Services\n\n" +
                "http://localhost:8080/doktorics_war/web-service/internal/dirivation\n\n";
    }

    @GetMapping("/web-service/internal/dirivation")
    public String internal() {
        return "derivation";
    }

}
