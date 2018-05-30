package br.com.unioeste.oficinamecanicapg.errors.controllers;

import org.springframework.http.HttpStatus;

/**
 * Created by alanna on 09/10/17.
 */
public class ControllerException extends RuntimeException {
    private final HttpStatus status;
    private final String message;

    public ControllerException(HttpStatus status, String message) {

        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}

