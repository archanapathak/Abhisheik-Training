package com.example.Springbootwith_mysql.exception;

import java.util.Date;

public class ExceptionResponse {
    Date timestamp;
    String message , detail;

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetail() {
        return detail;
    }

    public ExceptionResponse(Date timestamp, String message, String detail) {
        this.timestamp = timestamp;
        this.message = message;
        this.detail = detail;
    }
}
