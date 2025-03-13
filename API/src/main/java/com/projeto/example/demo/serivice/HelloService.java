package com.projeto.example.demo.serivice;

import org.springframework.stereotype.Service;

@Service

public class HelloService {
    public String Hello(String name) {
        return "HelloService" + name;
    }

    public String helloWord(String s) {
    return "HelloService" + s;}
}