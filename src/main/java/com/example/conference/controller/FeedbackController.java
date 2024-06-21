package com.example.conference.controller;

import com.example.conference.model.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FeedbackController{


    @GetMapping("/feedback")
    public String feedback(Model model) {
        model.addAttribute("message", "Feedback");
        return "feedback";

    }
}
