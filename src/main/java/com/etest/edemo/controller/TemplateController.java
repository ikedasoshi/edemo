package com.etest.edemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TemplateController {
    
    @RequestMapping("/")
    public Object template() {
        return "";
    }
}