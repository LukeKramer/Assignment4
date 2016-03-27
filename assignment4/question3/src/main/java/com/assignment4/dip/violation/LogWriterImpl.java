package com.assignment4.dip.violation;

/**
 * Created by student on 2016/03/22.
 */
public class LogWriterImpl {

String message;

    public LogWriterImpl(){

    }

    public LogWriterImpl(String message){

        this.message = message;

    }

    public String getMessage()
    {
        return message;
    }


    public void Write(String message)
    {
       LogWriterImpl log = new LogWriterImpl(message);
        System.out.println("Log: "+log.getMessage());
    }

}
