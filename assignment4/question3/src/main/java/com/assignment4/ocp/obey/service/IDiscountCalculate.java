package com.assignment4.ocp.obey.service;

/**
 * Created by student on 2016/03/22.
 */
public interface IDiscountCalculate {

    boolean Rule(String ruleName);

    double Calculate(int amount);
}
