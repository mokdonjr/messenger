package com.example.mymessenger.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "이곳에 주소지를 기록하시면 주변 약국 마스크 개수 충전 알림 구독이됩니다.");
        return "home";
    }
}
