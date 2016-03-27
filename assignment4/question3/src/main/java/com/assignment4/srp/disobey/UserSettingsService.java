package com.assignment4.srp.disobey;

/**
 * Created by student on 2016/03/22.
 */
public class UserSettingsService

    {

        public void changeEmail(String user)
        {

            if(checkAccess(user))

            {

                System.out.println("Access Granted");

            }

        }

        public boolean checkAccess(String user)
        {
            if (user.equals("Luke"))
            //Verify if the user is valid.
            return true;
            else
                return false;
        }

    }


