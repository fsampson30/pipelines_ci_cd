package com.sampson.pipelines_ci_cd.exceptions;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

public class ExceptionResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private LocalDateTime currentDateTime;
    private String message;
    private String details;

    public ExceptionResponse(LocalDateTime currentDateTime, String message, String details) {
        this.currentDateTime = currentDateTime;
        this.message = message;
        this.details = details;
    }

    public LocalDateTime getCurrentDateTime() {
        return currentDateTime;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
