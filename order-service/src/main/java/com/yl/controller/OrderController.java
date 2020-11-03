package com.yl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ylyang
 */
@RestController
public class OrderController {

    @GetMapping("test")
    public String get(){
        return "hello world";
    }
}
