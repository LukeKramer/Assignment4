package com.assignment4.dip;

import com.assignment4.dip.correct.comunicationtype.EmailEventImpl;
import com.assignment4.dip.correct.comunicationtype.LogEventImpl;
import com.assignment4.dip.correct.comunicationtype.SmsEventImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/22.
 */
public class TestDipcorrect {


    @Test
    public void testLog() throws Exception {

        LogEventImpl log = new LogEventImpl("Luke");

        Assert.assertNotSame(10,log.getMessage());

    }

    @Test
    public void testEmail() throws Exception {
        EmailEventImpl email = new EmailEventImpl("Hello World");

        Assert.assertEquals("Hello World",email.getMessage());

    }

    @Test
    public void testSms() throws Exception {

        SmsEventImpl sms = new SmsEventImpl("12345");

        Assert.assertNotNull(sms.getMessage());

    }
}
