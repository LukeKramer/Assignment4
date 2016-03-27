package com.assignment4.ocp.obey;

import com.assignment4.ocp.obey.service.IDiscountCalculate;

/**
 * Created by student on 2016/03/22.
 */
public class SummerDiscount implements IDiscountCalculate {

    public boolean Rule(String ruleName) {
        return "summer".equals(ruleName);
    }

    public double Calculate(int amount) {
        return amount*0.15;
    }
}
