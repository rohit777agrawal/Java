import java.util.Scanner;

public class Intergers 
{
	public static void main(String[] args)
	{
		int n1=0;
		int n2=0;
		System.out.println("Enter the lower and higher number respectively.");
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		
		if(n2>n1)
		{
			System.out.print("The number of integers that lies between them, including themselves is ");
			System.out.println((n2 - n1) + 1 );
			System.out.print("The following numbers are ");
			for (int i= n1;i<=n2;i++)
			{
				if (i<n2)
				{
				System.out.print(i + ",");
				}
				else
				{
					System.out.println(i + ".");
				}
				
			}	
		}
		else
		{
			System.out.println("Invalid! Please enter the lower number first.");
		}
			
	}

}
