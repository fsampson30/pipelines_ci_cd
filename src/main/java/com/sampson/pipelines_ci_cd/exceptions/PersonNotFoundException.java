package com.sampson.pipelines_ci_cd.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class PersonNotFoundException extends RuntimeException {

    public PersonNotFoundException(String message) {
        super(message);
    }

    @Serial
    private static final long serialVersionUID = 1L;

}
