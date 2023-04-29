package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/demo")
    @ResponseBody
    public String index() {
        return "안녕하세요 스프링부트 Demo Main page입니다.";
    }
}