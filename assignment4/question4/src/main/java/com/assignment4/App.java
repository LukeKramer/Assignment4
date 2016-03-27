package com.assignment4;


import com.assignment4.adp.obey.User;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        String name;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter in a username:");
        name = scan.nextLine();

        User user = new User();

        user.isValid(name);
    }
}
