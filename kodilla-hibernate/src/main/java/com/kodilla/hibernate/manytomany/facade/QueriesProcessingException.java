package com.kodilla.hibernate.manytomany.facade;

public class QueriesProcessingException extends Exception {
    public static String ERR_NAME_NULL = "name equals null";
    public static String ERR_NOT_FOUND = "record not found";

    public QueriesProcessingException(String message){
        super(message);
    }
}
