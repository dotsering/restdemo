package com.dorjee.restdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello() {
        return "hello dorjee";
    }

    @GetMapping("/hey")
    public String getHey() {
        return "Hey Dorjee";
    }


    @GetMapping("/jay")
    public String getJayy() {
        return "Hey Jay";
    }
}
