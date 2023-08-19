package com.example.test_calculator;

import com.example.test_calculator.exception.ZeroDivideException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorService();
    @Test
    void hello_success() {
        String expectedResult = "Добро пожаловать в калькулятор";
        String actualResult = calculatorService.hello();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void plus_success() {
        int num1 = 5;
        int num2 = 5;

        String expectedResult = TestUtils.formatResult(num1, num2, "+", "10");
        String actualResult = calculatorService.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void minus_success() {
        int num1 = 5;
        int num2 = 5;

        String expectedResult = TestUtils.formatResult(num1, num2, "-", "0");
        String actualResult = calculatorService.minus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply_success() {
        int num1 = 5;
        int num2 = 5;

        String expectedResult = TestUtils.formatResult(num1, num2, "*", "25");
        String actualResult = calculatorService.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_success() {
        int num1 = 5;
        int num2 = 5;

        String expectedResult = TestUtils.formatResult(num1, num2, "/", "1.0");
        String actualResult = calculatorService.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_withNum2IsZero() {
        int num1 = 5;
        int num2 = 0;

        String expectedErrorMessage = "400 На ноль делить нельзя!";
        Exception exception = assertThrows(ZeroDivideException.class, () -> calculatorService.divide(num1, num2));
        assertEquals(expectedErrorMessage, exception.getMessage());
    }
}