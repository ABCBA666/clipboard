package org.example.clipboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    @GetMapping("/single")
    public String singleItem() {
        return "single";
    }
    
    @GetMapping("/batch")
    public String batchItems() {
        return "batch";
    }
}
