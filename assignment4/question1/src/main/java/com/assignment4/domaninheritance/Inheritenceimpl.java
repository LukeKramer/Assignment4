package com.assignment4.domaninheritance;

import com.assignment4.domanencapsulation.Encapsulationimpl;

/**
 * Created by student on 2016/03/21.
 */
public class Inheritenceimpl extends Encapsulationimpl{

    private String lastname;

    public Inheritenceimpl()
    {

    }
    public Inheritenceimpl(String name,int age,String lastname)
    {
        super(name,age);
        this.lastname =lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Name: "+getName()+" LastName: "+getLastname()+" Age:"+getAge();
    }


}
