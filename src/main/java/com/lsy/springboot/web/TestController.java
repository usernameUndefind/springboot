package com.lsy.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")
public class TestController {


    @GetMapping("/getTest")
    public void test() {
        System.out.println("这是测试的controller");
    }
}
