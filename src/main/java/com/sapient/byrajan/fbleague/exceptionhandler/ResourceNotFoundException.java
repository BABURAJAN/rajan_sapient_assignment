package com.sapient.byrajan.fbleague.exceptionhandler;

/**
 * This class is used to handle exception if resource not found
 * @author BABURAJAN
 */
public class ResourceNotFoundException extends Exception {

    private static final long serialVersionUID = -9079454849611061074L;

    public ResourceNotFoundException() {
        super();
    }

    public ResourceNotFoundException(final String message) {
        super(message);
    }

}

