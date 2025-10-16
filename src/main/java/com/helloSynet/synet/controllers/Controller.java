package com.helloSynet.synet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @GetMapping("/")
    public String saludo(){
        return "Hello World";
    }
}
