package com.fsoft.quizsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz")
public class QuizListController {

    @GetMapping
    String showPage() {
        return "QuizList";
    }
}
