package com.yao.musespider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/spider")
public class TestController {

    @GetMapping(value = "/test")
    public String getTest(){
        return "test shanyap";
    }
}
