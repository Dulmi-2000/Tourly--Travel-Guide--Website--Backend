package com.example.tourly.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String username){
        super("Could not found the user with username  "+ username );
    }

}
