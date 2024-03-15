package com.example.tourly.exception;

public class LocationNameNotFoundException extends RuntimeException {

    public LocationNameNotFoundException(String locationName){
        super("Could not found the location with given location name  "+ locationName );
    }

}