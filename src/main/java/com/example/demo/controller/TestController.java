package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by cheney on 2017/6/15.
 */
@RestController
public class TestController {


    @RequestMapping("/hello")
    public String hello(){

        return "Hello,welcome to ctg.";
    }

}