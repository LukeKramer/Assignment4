package com.assignment4.Ocp;

import com.assignment4.ocp.disobey.DiscountCalculator;
import com.assignment4.ocp.obey.domain.DiscountService;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/22.
 */
public class TestOcp {

    private DiscountCalculator discount;


    @Test
    public void testName() throws Exception {

        discount = new DiscountCalculator();
        double result = discount.Discount(200,"summer");

        String a = Double.toString(result);
        System.out.println(a);

        Assert.assertEquals("30.0",a);


    }

    @Test
    public void test1() throws Exception {

        DiscountService service = new DiscountService();
        double result = service.Discount(400,"summer");
        String a = Double.toString(result);
        System.out.println(a);
        Assert.assertEquals("60.0",a);


    }
}
