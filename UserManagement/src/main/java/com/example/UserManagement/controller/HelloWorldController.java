package com.example.UserManagement.controller;

import com.example.UserManagement.bean.HelloWorldBean;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {
    @GetMapping("/sayhi")
    public String sayHi(){
        return "say hi to helloworld";
    }

    @GetMapping("/helloworldbean")
    public HelloWorldBean helloworldbean(){
        return new HelloWorldBean("welcome to hellowrold bean");
    }
    @GetMapping("/path-variable/{name}")
    public String  helloworldwithPathvariable(@PathVariable String name){
        return "welcome to hellowrold bean dear ..."+name;
    }
    @GetMapping("/requestparam")
    public String  helloworldwithRequestParam(@RequestParam("name") String name){
        return "welcome to hellowrold bean requestparam dear ..."+name;
    }


}
