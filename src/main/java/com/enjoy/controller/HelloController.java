package com.enjoy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!!!你hahahahahahha你好啊啊啊啊，李荣轩111";
    }
}
