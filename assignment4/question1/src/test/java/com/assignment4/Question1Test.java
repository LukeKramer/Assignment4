package com.assignment4;

import com.assignment4.domanencapsulation.Encapsulationimpl;
import com.assignment4.domaninheritance.Inheritenceimpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/21.
 */
public class Question1Test {

    @Test
    public void testEncapsulation() throws Exception {

        Encapsulationimpl encap = new Encapsulationimpl();
        encap.setName("Luke");

        Assert.assertNotSame("Dave",encap.getName());

    }

    @Test
    public void testInheritance() throws Exception {

        Inheritenceimpl inherit =  new Inheritenceimpl();
        inherit.setAge(43);

        Assert.assertEquals(43,inherit.getAge());


    }

    @Test
    public void testPolymorphism() throws Exception {


        Inheritenceimpl inherit = new Inheritenceimpl("Luke",24,"Kramer");
        Encapsulationimpl encap = new Encapsulationimpl("Luke",24);

        Assert.assertNotEquals(encap.toString(),inherit.toString());

    }
}
