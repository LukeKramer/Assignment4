package com.assignment4.dip.correct.domain;

import com.assignment4.dip.correct.service.Notification;

/**
 * Created by student on 2016/03/22.
 */
public class AppPoolWatcher {

    Notification action = null;


    public AppPoolWatcher(Notification implementation)
    {
        this.action = implementation;
    }

    public void Notify(String message)
    {
        action.ActOnNotification(message);
    }
}
