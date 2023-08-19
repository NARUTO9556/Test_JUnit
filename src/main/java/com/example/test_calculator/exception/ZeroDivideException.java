package com.example.test_calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpStatusCodeException;

public class ZeroDivideException extends HttpStatusCodeException {
    public ZeroDivideException(String message) {
        super(HttpStatus.BAD_REQUEST, message);
    }
}
