package com.assignment4;

import com.assignment4.adp.obey.Disobey.UserDependecy;
import com.assignment4.adp.obey.User;
import com.assignment4.adp.obey.ValidUser;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/24.
 */
public class TestAdp {

    @Test
    public void testObey() throws Exception {

        ValidUser validate = new ValidUser();

        User user = new User();

        Assert.assertTrue(validate.isValid());

    }

    @Test
    public void testDisobey() throws Exception {

        UserDependecy user = new UserDependecy();

        Assert.assertNotSame("Dave",user.isValid("Luke"));

    }
}
