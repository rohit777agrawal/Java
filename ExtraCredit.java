import java.util.Scanner;

/*
Program for ExtraCredit.
Author: Rohit Agrawal
E-mail Address: ra2381@email.vccs.edu
Programming Assignment Extra.
Last Changed: April 28, 2018.
*/

public class ExtraCredit {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		// integer for getting value
		int input = 0;
		boolean statement = true;
		Scanner keyboard = new Scanner(System.in);
		
		do
		{
		System.out.println("Enter the amount of odd numbers to show?");
		input = keyboard.nextInt();
		if (input>=1 && input<=50)  // limit to 1-50
		{
			for (int i = 1; i<=input+(input-1); i++, i++) // use for statement for adding value. 
			{
				System.out.print(i);
				if (i == input+(input-1))
				{
					System.out.print(".");
				}
				else
				{
					System.out.print(" + ");
				}
			}
			statement = false;
		}
		else  // if out of range prompt user to provide within range. 
		{
			System.out.println("Invalid number");
			System.out.println("try it once again");
		}
		}while (statement);
	}
}
