package com.assignment4.dip.correct.comunicationtype;

import com.assignment4.dip.correct.service.Notification;

/**
 * Created by student on 2016/03/22.
 */
public class SmsEventImpl implements Notification {

    private String message;
    public SmsEventImpl()
    {

    }

    public SmsEventImpl(String message)
    {
        this.message = message;

    }


    public String getMessage()
    {
        return message;
    }

    public void ActOnNotification(String message)
    {
        SmsEventImpl sms = new SmsEventImpl(message);
        System.out.println("SMS: "+ sms.getMessage());
    }
}
