package com.example.tourly.exception;

public class EmailNotFoundException extends RuntimeException {

    public EmailNotFoundException(String email){
        super("Could not found the user with email  "+ email );
    }

}