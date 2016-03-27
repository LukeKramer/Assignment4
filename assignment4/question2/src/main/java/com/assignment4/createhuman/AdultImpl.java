package com.assignment4.createhuman;

import com.assignment4.domain.Personimpl;
import com.assignment4.service.Human;

/**
 * Created by student on 2016/03/22.
 */
public class AdultImpl implements Human {

    private String name;
    private int age;
    public Personimpl getPerson()
    {
        Personimpl person = new Personimpl(name,age);
        return person;
    }
}
