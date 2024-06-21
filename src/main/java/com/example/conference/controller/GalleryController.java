package com.example.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GalleryController {

    @GetMapping("/gallery")
    public String gallery(Model model) {
        model.addAttribute("message", "gallery");
        return "gallery";

    }
}
