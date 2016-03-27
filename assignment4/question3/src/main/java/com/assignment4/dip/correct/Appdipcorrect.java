package com.assignment4.dip.correct;

import com.assignment4.dip.correct.comunicationtype.EmailEventImpl;
import com.assignment4.dip.correct.comunicationtype.LogEventImpl;
import com.assignment4.dip.correct.comunicationtype.SmsEventImpl;
import com.assignment4.dip.correct.domain.AppPoolWatcher;
import com.assignment4.dip.correct.service.Notification;

import java.util.Scanner;

/**
 * Created by student on 2016/03/22.
 */
public class Appdipcorrect {

    public static void main(String args[])
    {
        String log;
        String mail;
        String sms;
        Scanner scan = new Scanner(System.in);
        AppPoolWatcher watcher;

        System.out.println("Write an Email: ");
        mail = scan.nextLine();

        System.out.println("Log a complaint: ");
        log = scan.nextLine();

        System.out.println("Write an Sms: ");
        sms = scan.nextLine();

        LogEventImpl writer = new LogEventImpl();
        EmailEventImpl email = new EmailEventImpl();
        SmsEventImpl message = new SmsEventImpl();



        watcher = new AppPoolWatcher(email);

        watcher.Notify(mail);

        watcher = new AppPoolWatcher(writer);

        watcher.Notify(log);

        watcher = new AppPoolWatcher(message);

        watcher.Notify(sms);

    }
}
