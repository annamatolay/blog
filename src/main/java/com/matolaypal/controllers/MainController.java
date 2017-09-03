package com.matolaypal.controllers;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 */
@Controller
@Scope("session")
public class MainController {

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }
}
