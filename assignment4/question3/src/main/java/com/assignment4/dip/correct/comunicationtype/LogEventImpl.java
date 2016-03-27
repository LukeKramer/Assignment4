package com.assignment4.dip.correct.comunicationtype;

import com.assignment4.dip.correct.service.Notification;

/**
 * Created by student on 2016/03/22.
 */
public class LogEventImpl implements Notification{

    private String message;

    public LogEventImpl()
    {

    }
    public LogEventImpl(String message)
    {
        this.message = message;

    }


    public String getMessage()
    {
        return message;
    }


    public void ActOnNotification(String message)
    {
        LogEventImpl log = new LogEventImpl(message);
        System.out.println("Log: "+ log.getMessage());
    }
}
