package com.assignment4.ocp.obey.domain;

import com.assignment4.ocp.obey.SummerDiscount;
import com.assignment4.ocp.obey.service.IDiscountCalculate;

/**
 * Created by student on 2016/03/22.
 */
public class DiscountService {

    double discountvalue;
    public IDiscountCalculate discountservice;

    public DiscountService()
    {
        discountservice = new SummerDiscount();
    }


    public double Discount(int amount , String rule)
    {
            if(discountservice.Rule(rule))

            {
                discountvalue = discountservice.Calculate(amount);
            }




        return discountvalue;
    }


}
