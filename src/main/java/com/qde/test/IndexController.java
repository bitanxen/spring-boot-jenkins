package com.qde.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/index")
    public String getIndex() {
        return "Hello Spring Boot";
    }
}
