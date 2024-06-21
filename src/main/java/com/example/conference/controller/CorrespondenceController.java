package com.example.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CorrespondenceController {

    @GetMapping("/correspondence")
    public String feedback(Model model) {
        model.addAttribute("message", "Correspondence");
        return "correspondence";

    }
}
