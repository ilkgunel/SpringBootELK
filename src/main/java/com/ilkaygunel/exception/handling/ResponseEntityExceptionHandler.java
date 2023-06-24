package com.ilkaygunel.exception.handling;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ResponseEntityExceptionHandler extends org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {RuntimeException.class})
    public ResponseEntity<Object> handleNotFound(RuntimeException runtimeException, WebRequest webRequest) {
        return handleExceptionInternal(runtimeException, runtimeException.getMessage(), new HttpHeaders(), HttpStatus.NOT_FOUND, webRequest);
    }
}
