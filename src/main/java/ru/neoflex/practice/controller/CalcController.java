package ru.neoflex.practice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalcController {
    @GetMapping("/plus/{a}/{b}")
    public String GetSum(@PathVariable("a") double a,@PathVariable("b") double b ){
        double result = a + b;
        return String.valueOf(result);
    }

    @GetMapping("/minus/{a}/{b}")
    public String GetDifference(@PathVariable("a") double a,@PathVariable("b") double b ){
        double result = a - b;
        return String.valueOf(result);
    }
}
