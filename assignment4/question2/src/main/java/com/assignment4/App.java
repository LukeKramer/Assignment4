package com.assignment4;

import com.assignment4.createhuman.AdultImpl;
import com.assignment4.domain.Personimpl;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String name;
        int age;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter in a name:");
        name = scan.nextLine();
        System.out.println("Enter in a age:");
        age = scan.nextInt();

        Personimpl person = new AdultImpl().getPerson();

        person.setName(name);
        person.setAge(age);

        System.out.println(""+person.toString());

    }
}
