package com.kodilla.exception.nullPointer;

public class MessageNotSendException extends Exception {

    public MessageNotSendException(final String massage) {
        super(massage);
    }

}
