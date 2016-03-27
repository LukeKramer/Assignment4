package com.assignment4.Srp;

import com.assignment4.srp.disobey.UserSettingsService;
import com.assignment4.srp.disobey.obey.SecuritySetting;
import com.assignment4.srp.disobey.obey.SettingsService;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/22.
 */
public class TestSrp {
    @Test
    public void testIncorrectImpl() throws Exception {

        UserSettingsService service = new UserSettingsService();

        service.changeEmail("Luke");

        boolean result = service.checkAccess("dave");
        Assert.assertFalse(result);

    }

    @Test
    public void testCorrectImpl() throws Exception {

        SecuritySetting security = new SecuritySetting();

        boolean result = security.checkAccess("Luke");

        Assert.assertTrue(result);

    }
}
