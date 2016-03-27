package com.assignment4;

import com.assignment4.domanencapsulation.Encapsulationimpl;
import com.assignment4.domaninheritance.Inheritenceimpl;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        String name;
        String lastname;
        int age;


        System.out.println("Enter in a name: ");
        name = scan.nextLine();
        System.out.println("Enter in a last name: ");
        lastname = scan.nextLine();
        System.out.println("Enter in a age: ");
        age = scan.nextInt();


        Inheritenceimpl inherit = new Inheritenceimpl();
        inherit.setName(name);
        inherit.setAge(age);
        inherit.setLastname(lastname);





        System.out.println(" "+inherit.toString());




    }
}
