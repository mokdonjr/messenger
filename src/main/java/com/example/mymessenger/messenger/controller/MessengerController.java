package com.example.mymessenger.messenger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/messenger")
@RestController
public class MessengerController {

    @GetMapping("/test")
    public String test() {
        return "hi";
    }
}
