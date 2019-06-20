/*
  Program to divide numbers.
  Author: Rohit Agrawal
  E-mail Address: ra2381@email.vccs.edu
  Programming class assignment.
  Last Changed: Sep 13, 2018.
 */

import java.util.Scanner;

public class Divide {
	
	public static void main (String[] args)
	{
		double numerator = getNumerator();
		double denominator = getDenominator();
		double quotient = calculateQuotient(numerator,denominator);
		print(numerator,denominator,quotient);
	}
	
	public static double getNumerator()
	{
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the numerator?");
		double numerator = keyboard.nextDouble();
		
		return numerator;
	}
	
	public static double getDenominator()
	{
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		double denominator;
		do
		{
			System.out.println("Enter the denominator?");
			denominator = keyboard.nextDouble();
			if (denominator == 0.0)
			{
				System.out.println("Denominator cannot be zero!");
			}
		}while (denominator==0);
		
		return denominator;
		
	}
	
	public static double calculateQuotient(double numerator, double denominator)
	{
		double quotient = numerator/denominator;
		return quotient;
	}
	
	public static void print (double numerator, double denominator, double quotient)
	{
		System.out.println("The numerator is: " + numerator);
		System.out.println("The denominator is: " + denominator);
		System.out.println("The quotient is: " + quotient);
	}
	

}
