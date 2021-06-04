package com.sapient.byrajan.fbleague.exceptionhandler;

/**
 * This class is used to handle exception if request is invalid
 * @author BABURAJAN
 */
public class StandingServiceException extends Exception {

    private static final long serialVersionUID = -470180507998010368L;

    public StandingServiceException() {
        super();
    }

    public StandingServiceException(final String message) {
        super(message);
    }
}
