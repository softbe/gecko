package ru.softbe.gecko.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/test")
    public String test() {
        return "Hello World!";
    }
}
