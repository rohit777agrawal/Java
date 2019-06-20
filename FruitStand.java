/*
  Program for Calculate Fruit Stand.
  Author: Rohit Agrawal
  E-mail Address: ra2381@email.vccs.edu
  Programming ClassWork.
  Last Changed: August 30, 2018.
 */
import java.util.Scanner;

public class FruitStand {
	
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int quantity = 0;
		double price = 0;
		String fruit;
		
		do
		{
			
			System.out.println("Which fruit do you want to buy? Apple, banana, or mango?");
			fruit = keyboard.nextLine();
			
			if (fruit.toLowerCase().equals("apple") )
			{
				System.out.println("You choose: "+ fruit);
				System.out.println("How many apples do you need?");
				quantity = keyboard.nextInt();
				price = quantity * .30;	
			}
			else if (fruit.toLowerCase().equals("banana"))
			{
				System.out.println("You choose: "+ fruit);
				System.out.println("How many bananas do you need?");
				quantity = keyboard.nextInt();
				price = quantity * .40;
			}
			else if (fruit.toLowerCase().equals("mango"))
			{
				System.out.println("You choose: "+ fruit);
				System.out.println("How many mangoes do you need?");
				quantity = keyboard.nextInt();
				price = quantity * .50;
			}
			
		}while (!fruit.equals("apple") && !fruit.equals("banana") && !fruit.equals("mango"));
		
		System.out.println("The cost of " + quantity + " "+ fruit + " is $" + price);
		
		keyboard.close();
		
		
	}

}
