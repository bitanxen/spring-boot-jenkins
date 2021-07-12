package com.qde.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/index")
    public String getIndex() {
        return "Hello Spring Boot";
    }

    @GetMapping("/dev1")
    public String getDev1() {
        return "Hello Spring Boot From Dev 1.. This is wrong";
    }

    @GetMapping("/dev2")
    public String getDev2() {
        return "Hello From Dev 2 ";
    }
}
