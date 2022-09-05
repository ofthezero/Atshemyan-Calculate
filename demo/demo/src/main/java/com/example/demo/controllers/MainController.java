package com.example.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


    @GetMapping("/")
    public String greeting( Model model) {
        model.addAttribute("name", "Главная страница");
        return "index";
    }

    @GetMapping("/calc")
    public String Calc(Model model)
    {
        model.addAttribute("name", 167);
        return "index";
    }

    @GetMapping("/getr")
    public String GetResult(
            @RequestParam(
                    value = "var3",
                    required = false,
                    defaultValue = "1") int a,
            @RequestParam(
                    value = "var4",
                    required = false,
                    defaultValue = "2") int b,
            @RequestParam(
                    value = "sel1",
                    required = false) int z,
            Model model)
    {
        int c = 0;
        if (z == 1)
        {
            c = a + b;
        }
        else if (z == 2)
        {
            c = a - b;
        }
        else if (z == 3)
        {
            c = a * b;
        }
        else if (z == 4)
        {
            c = a / b;
        }
        model.addAttribute("resoperation", c);
        return "result";
    }

    @PostMapping("/res")
    public String PostResult(
            @RequestParam(
                    value = "var",
                    required = false,
                    defaultValue = "1") int a,
            @RequestParam(
                    value = "var2",
                    required = false,
                    defaultValue = "2") int b,
            @RequestParam(
                    value = "sel",
                    required = false) int z,
            Model model)
    {
        int c = 0;
        if (z == 1)
        {
            c=a+b;
        }
        else if (z == 2)
        {
            c = a - b;
        }
        else if (z == 3)
        {
            c = a * b;
        }
        else if (z == 4)
        {
            c = a / b;
        }

        model.addAttribute("resoperation", c);

        return "result";
    }

}

