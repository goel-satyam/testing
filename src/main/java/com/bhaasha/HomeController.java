package com.bhaasha;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/get")
    public String getText() {
        return "Hello";
    }
}
