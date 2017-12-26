package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wenxinhang
 * @Date 2017/12/25
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/test")
    public String test(){
        return "successd";
    }
}
