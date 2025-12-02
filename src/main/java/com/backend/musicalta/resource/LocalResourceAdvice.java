package com.backend.musicalta.resource;

import com.backend.musicalta.exceptions.LocalNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class LocalResourceAdvice {
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(LocalNotFoundException.class)
    public String localNotFoundHandler(LocalNotFoundException exception){
        return exception.getMessage();
    }
}

