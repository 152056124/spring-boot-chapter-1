package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController复合注解，相当于@ResponseBody（将返回的对象转化为json格式数据）+@Controller
@RestController
@RequestMapping("/helloController")
public class HelloController {

    @GetMapping("/hello")
    public String index() {
        return "Hello World";
    }

}
