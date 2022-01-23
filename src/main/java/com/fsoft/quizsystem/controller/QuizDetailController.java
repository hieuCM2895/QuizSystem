package com.fsoft.quizsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz/{quizId}")
public class QuizDetailController {

    @GetMapping
    String showPage(@PathVariable Long quizId) {
        return "QuizDetail";
    }
}
