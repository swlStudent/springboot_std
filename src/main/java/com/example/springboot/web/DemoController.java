package com.example.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("category")
public class DemoController {
    @RequestMapping("/demo")
    public String hello() {

        return "listCategory";
    }
}
