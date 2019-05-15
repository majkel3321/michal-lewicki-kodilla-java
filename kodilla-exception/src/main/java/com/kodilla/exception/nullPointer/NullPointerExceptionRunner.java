package com.kodilla.exception.nullPointer;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {

        User user = null;

        MessageSender messageSender = new MessageSender();

        try {
            messageSender.sendMessageTo(user, "Hello!");
        } catch (MessageNotSendException e) {
            System.out.println("Message was not send, but my program is still running quite well!");
        }

        System.out.println("Processing other logic!");


    }
}
