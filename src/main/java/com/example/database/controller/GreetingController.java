package com.example.database.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        String firstname = "Bin Lê";
        model.addAttribute("hehe",firstname);
        return "greeting";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name",required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

}
