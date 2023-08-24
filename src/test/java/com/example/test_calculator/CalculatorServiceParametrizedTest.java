package com.example.test_calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceParametrizedTest {
    private final CalculatorService calculatorService = new CalculatorService();
    public static Stream<Arguments> plusParams() {
        return Stream.of(
                Arguments.of(2, 2, "2 + 2 = 4"),
                Arguments.of(8, 4, "8 + 4 = 12"),
                Arguments.of(777, 11, "777 + 11 = 788")
        );
    }
    @ParameterizedTest
    @MethodSource("plusParams")
    void plus(int num1, int num2, String result) {
        assertEquals(result, calculatorService.plus(num1, num2));
    }

    public static Stream<Arguments> minusParams() {
        return Stream.of(
                Arguments.of(2, 2, "2 - 2 = 0"),
                Arguments.of(8, 4, "8 - 4 = 4"),
                Arguments.of(777, 11, "777 - 11 = 766")
        );
    }
    @ParameterizedTest
    @MethodSource("minusParams")
    void minus(int num1, int num2, String result) {
        assertEquals(result, calculatorService.minus(num1, num2));
    }

    public static Stream<Arguments> multiplyParams() {
        return Stream.of(
                Arguments.of(2, 2, "2 * 2 = 4"),
                Arguments.of(8, 4, "8 * 4 = 32"),
                Arguments.of(777, 11, "777 * 11 = 8547")
        );
    }
    @ParameterizedTest
    @MethodSource("multiplyParams")
    void multiply(int num1, int num2, String result) {
        assertEquals(result, calculatorService.multiply(num1, num2));
    }

    public static Stream<Arguments> divideParams() {
        return Stream.of(
                Arguments.of(2, 2, "2 / 2 = 1.0"),
                Arguments.of(8, 4, "8 / 4 = 2.0"),
                Arguments.of(222, 111, "222 / 111 = 2.0")
        );
    }
    @ParameterizedTest
    @MethodSource("divideParams")
    void divide(int num1, int num2, String result) {
        assertEquals(result, calculatorService.divide(num1, num2));
    }
}