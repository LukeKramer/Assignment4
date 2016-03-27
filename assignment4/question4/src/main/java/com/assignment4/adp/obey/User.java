package com.assignment4.adp.obey;

/**
 * Created by student on 2016/03/24.
 */
public class User{

    private String Username = "Luke";

    public boolean isValid(String username)
    {
        if(!username.equals(Username))
        {
            System.out.println("Invalid user name");
        }
        else{
            System.out.println("Welcome "+ username);
        }

        return username.equals(Username);

    }
}
