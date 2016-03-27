package com.assignment4;

import com.assignment4.createhuman.AdultImpl;
import com.assignment4.domain.Personimpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/22.
 */
public class Question2Test {

    Personimpl adult = new AdultImpl().getPerson();

    @Test
    public void testAge() throws Exception {

        adult.setAge(24);

        Assert.assertEquals(24,adult.getAge());

    }

    @Test
    public void testName() throws Exception {



        adult.setName("Luke");
        Assert.assertNotEquals("Dave",adult.getName());

    }
}
