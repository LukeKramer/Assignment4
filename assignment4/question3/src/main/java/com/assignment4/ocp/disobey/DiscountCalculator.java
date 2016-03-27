package com.assignment4.ocp.disobey;

/**
 * Created by student on 2016/03/22.
 */
public class DiscountCalculator {

    double discountvalue;

    public double Discount(int amount, String Rule)
    {
        if(Rule.equals("summer"))
        {
            discountvalue = amount * 0.15;

        }
        else if(Rule.equals("winter"))
        {


            discountvalue = amount * 0.10;

        }
        else if(Rule.equals("christmas"))
        {


            discountvalue = amount * 0.30;

        }

        return discountvalue;


    }
}
