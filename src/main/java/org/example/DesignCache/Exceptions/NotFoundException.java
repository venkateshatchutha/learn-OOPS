package org.example.DesignCache.Starage.Exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException(final String message ){
        super(message);
    }
}
