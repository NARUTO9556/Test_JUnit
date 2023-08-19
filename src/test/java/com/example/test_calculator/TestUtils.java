package com.example.test_calculator;

public class TestUtils {
    public static String formatResult(int num1, int num2, String operation, String sum) {
        return String.format("%s %s %s = %s", num1, operation, num2, sum);
    }
}
