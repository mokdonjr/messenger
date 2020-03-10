package com.example.mymessenger.mask.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mask")
@RestController
public class MaskController {

    @GetMapping("/test")
    public String test() {
        return "hi mask";
    }
}
