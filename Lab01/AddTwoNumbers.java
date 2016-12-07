/*
 * File name: AddTwoNumbers.java
 *
 * Programmer: Justin Lomelino
 * ULID: jclomel
 *
 * Date: 8/23/16
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Dr. Tonya Pierce
 * Lab Section: 20
 * Lab Instructor: Dr. Tonya Pierce
 */

package edu.ilstu;

import java.util.Scanner;


/**
 * Adds two numbers read from the keyboard
 *
 * @author Justin Lomelino
 *
 */
public class AddTwoNumbers 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int num1 = 0;
        int num2 = 0;
        
        System.out.println("Hello");
        System.out.println("I will add two numbers for you.");
        System.out.print("Enter two whole numbers on the same line with a space in between: ");
        
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        
        System.out.print("The sum of those two numbers is ");
        System.out.println(num1 + num2);
        
    }
}
