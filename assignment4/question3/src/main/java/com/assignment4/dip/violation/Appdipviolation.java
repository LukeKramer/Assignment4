package com.assignment4.dip.violation;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by student on 2016/03/22.
 */
public class Appdipviolation {

    public static void main( String[] args )
    {
        String message;
        Scanner scan = new Scanner(System.in);

        System.out.println("Log a message:");
        message = scan.nextLine();
        WatcherImpl watch = new WatcherImpl();
        watch.Notify(message);


    }
}
