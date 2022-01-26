package com.sid.demogradle.exception;

import java.util.Date;

public class ErrorMessage {
    private int statusCode;
    private Date timespamp;
    private String message;
    private String description;
    

    public ErrorMessage(int statusCode, Date timestamp, String message, String description){
        this.statusCode = statusCode;
        this.timespamp = timestamp;
        this.message = message;
        this.description = description;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public Date getTimespamp() {
        return timespamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
