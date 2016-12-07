/*
 * File name: poolCalc.java
 *
 * Programmer: Justin Lomelino
 * ULID: jclomel
 *
 * Date: Sep 11, 2016
 *
 * Class: IT 168
 * Lecture Section: 19
 * Lecture Instructor: Dr. Tonya Pierce
 * Lab Section: 20
 * Lab Instructor: Dr. Tonya Pierce 
 */
package edu.ilstu.poolCalculator;

import java.util.Scanner;

/**
 * Prompts user for length, width, and average depth measurements
 * for a swimming pool, then calculates and displays the perimeter,
 * volume, gallons of water, and underground surface area of the pool
 * in feet.
 *
 * @author Justin Lomelino
 *
 */
public class poolCalculator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double length=0;
		double width=0;
		double depth=0;
		final double GALLONS_PER_CUBIC_FOOT = 7.48;
		
		//prompt user for input and save it
		System.out.print("Enter the length of the pool: ");
		length = keyboard.nextInt();
		System.out.print("Enter the width of the pool: ");
		width = keyboard.nextInt();
		
		//some useful calculations
		double lengthXwidth = length * width;
		double lengthPlusWidth = length + width;
		
		System.out.print("Enter the average depth of the pool: ");
		depth = keyboard.nextInt();
		
		//calculate the values to output as per the provided equations
		double perimeter = 2 * lengthPlusWidth;
		double volume = lengthXwidth * depth;
		double gallons = volume * GALLONS_PER_CUBIC_FOOT;
		double undergroundSurfaceArea = 2 * lengthPlusWidth * depth + lengthXwidth;
		
		//output the results of the calculations
		System.out.printf("Perimeter = %3.1f\n", perimeter);
		System.out.printf("Volume = %3.1f\n", volume);
		System.out.printf("Gallons of water = %3.1f\n", gallons);
		System.out.printf("Underground surface area = %3.1f\n", undergroundSurfaceArea);
		
		//close the Scanner to prevent waste of system resources
		keyboard.close();
		
	}

}
