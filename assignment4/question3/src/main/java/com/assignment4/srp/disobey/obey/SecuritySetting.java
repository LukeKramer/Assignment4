package com.assignment4.srp.disobey.obey;

/**
 * Created by student on 2016/03/22.
 */
public class SecuritySetting {

    public static boolean checkAccess(String user)

    {
            if (user.equals("Luke"))
                //Verify if the user is valid.
                return true;
            else
                return false;
    }

}
