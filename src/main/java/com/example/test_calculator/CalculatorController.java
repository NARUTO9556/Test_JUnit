package com.example.test_calculator;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpStatusCodeException;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    @ExceptionHandler({HttpStatusCodeException.class})
    public String handleException(HttpStatusCodeException e) {
        return "Code: " + e.getStatusCode() + ". Error: " + e.getMessage();
    }
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.minus(num1,num2);
    }
    @GetMapping(path = "/multiply")
    public String multiply (@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.multiply(num1,num2);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.divide(num1,num2);
    }
}
