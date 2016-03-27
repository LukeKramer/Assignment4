package com.assignment4.domanencapsulation;

/**
 * Created by student on 2016/03/21.
 */
public class Encapsulationimpl {

    private String name;
    private int age;

    public Encapsulationimpl()
    {


    }

    public Encapsulationimpl(String name, int age)
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

    @Override
    public String toString() {
        return "Name: "+ getName()+" Age: "+ getAge();
    }


}
