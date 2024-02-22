package com.ticket.booking.exception;

public class NoDataFoundException extends RuntimeException{

    public NoDataFoundException(String message){
        super(message);
    }
}
