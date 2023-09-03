package com.project.board.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

@RequiredArgsConstructor
public class QuestionController {

    @GetMapping("/")
    public String MainPage(){ return "/question/main"; }
}
