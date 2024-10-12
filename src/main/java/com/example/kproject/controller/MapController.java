package com.example.kproject.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {

    @Value("${kakao.api.key}")
    private String kakaoApiKey;

    @GetMapping("/")
    public String showMap(Model model) {
        model.addAttribute("kakaoApiKey", kakaoApiKey);
        return "map";
    }
}