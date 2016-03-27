package com.assignment4.dip.correct.comunicationtype;

import com.assignment4.dip.correct.service.Notification;

/**
 * Created by student on 2016/03/22.
 */
public class EmailEventImpl implements Notification{

    private String message;

    public EmailEventImpl()
    {

    }
    public EmailEventImpl(String message)
    {
        this.message = message;

    }


    public String getMessage()
    {
        return message;
    }

    public void ActOnNotification(String message)
    {
        EmailEventImpl email = new EmailEventImpl(message);
        System.out.println("Email: "+ email.getMessage());
    }
}
