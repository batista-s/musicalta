package com.backend.musicalta.resource;

import com.backend.musicalta.exceptions.AtracaoNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class AtracaoResourceAdvice {
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(AtracaoNotFoundException.class)
    public String atracaoNotFoundHandler(AtracaoNotFoundException exception){
        return exception.getMessage();
    }
}
