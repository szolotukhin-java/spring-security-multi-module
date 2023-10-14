package com.acme.doktorics.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UiController {

    @GetMapping("/")
    public String home() {
        return "ui";
    }
}
