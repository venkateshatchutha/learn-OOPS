package org.example.DesignCache.Starage.Exceptions;

public class StorageFullException extends RuntimeException{

    public StorageFullException(final String message ){
        super(message);
    }
}
