package com.assignment4.srp.disobey.obey;

/**
 * Created by student on 2016/03/22.
 */
public class SettingsService {

    public void changeEmail(String user)

    {

        if(SecuritySetting.checkAccess(user))

        {

            System.out.println("Access Granted");


        }

    }

}
