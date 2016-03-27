package com.assignment4.domain;

import java.io.Serializable;

/**
 * Created by student on 2016/03/21.
 */
public class Personimpl implements Serializable {

    private String name;
    private int age;

    public Personimpl()
    {


    }

    public Personimpl(String name, int age)
    {
        this.name = name;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public void setAge(int newAge) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String determine()
    {
        String result;
        if(getAge()>1&getAge()<18)
        {

            result ="YOU ARE A MINOR!!";
        }
        else{

            result ="YOU ARE A ADULT!! ";


        }

        return result;
    }

    @Override
    public String toString() {
        return "Name: "+ getName()+" Age: "+ getAge()+"\n\n"+determine();
    }


}
