package com.example.test_calculator;

import com.example.test_calculator.exception.ZeroDivideException;
import org.springframework.stereotype.Service;


@Service
public class CalculatorService {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        int sum = num1 + num2;
        return getResult(num1, num2, "+", String.valueOf(sum));
    }
    public String minus (int num1, int num2) {
        int sum = num1 - num2;
        return getResult(num1, num2,"-", String.valueOf(sum));
    }
    public String multiply(int num1, int num2) {
        int sum = num1 * num2;
        return getResult(num1, num2, "*", String.valueOf(sum));
    }
    public String divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ZeroDivideException("На ноль делить нельзя!");
        }
        double sum = (double) num1 / num2;
        return getResult(num1, num2, "/", String.valueOf(sum));
    }
    private String getResult(int num1, int num2, String operation, String sum) {
        return String.format("%s %s %s = %s", num1, operation, num2, sum);
    }
}
