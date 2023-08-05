package com.goCash.exception;

import org.springframework.http.HttpStatus;

public class PassWordMatcher extends RuntimeException {
    private String message;
    private HttpStatus httpStatus;

    public PassWordMatcher(String message) {
        this.message = message;
    }

    public PassWordMatcher(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public PassWordMatcher(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
