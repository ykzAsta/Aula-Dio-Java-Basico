package com.projeto.example.demo.controller;

import com.projeto.example.demo.serivice.HelloService;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Hello-word")
public class HelloWordController {

    @PostMapping("/{id}")
    public String HelloWordPost (@PathVariable("id")String  id,@RequestBody User body ){
        return "Hello " + body.getName() + id + " !";
    }
}



