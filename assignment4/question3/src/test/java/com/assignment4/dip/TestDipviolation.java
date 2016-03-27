package com.assignment4.dip;

import com.assignment4.dip.violation.LogWriterImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

/**
 * Created by student on 2016/03/22.
 */
public class TestDipviolation {


    @Test
    public void testWriter() throws Exception {


        LogWriterImpl writer = new LogWriterImpl("Hello there");


        Assert.assertEquals("Hello there", writer.getMessage());

    }
}
