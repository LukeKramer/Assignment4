package com.assignment4.adp.obey.Disobey;

import com.assignment4.adp.obey.Login;

/**
 * Created by student on 2016/03/24.
 */
public class UserDependecy {

    Login login = new Login();

    public boolean isValid(String username)
    {
        if(!username.equals(login.getUsername()))
        {
            System.out.println("Invalid user name");
        }
        else{
            System.out.println("Welcome "+ username);
        }

        return username.equals(login.getUsername());

    }
}
