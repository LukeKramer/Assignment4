package com.assignment4.adp.obey;

/**
 * Created by student on 2016/03/24.
 */
public class ValidUser {

    public boolean isValid()
    {

        Login login = new Login();
        User user = new User();

        return user.isValid(login.getUsername());
    }
}
