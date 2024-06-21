package com.example.conference.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class ArchivesController {

    @GetMapping("/archives")
    public String feedback(Model model) {
        model.addAttribute("message", "Feedback");
        return "archives";
    }
}
