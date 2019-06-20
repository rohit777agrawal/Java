import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int total = 0;
		int count = 0;
		int score = 0;
		
		System.out.println("What is the student name? Type 'done' if no names to add.");
		name = keyboard.nextLine();
		
		if (name.toLowerCase().equals("done"))
		{
			System.out.println("No one took test!");
		}
		
		while (!name.toLowerCase().equals("done"))
		{
			System.out.println("What is the score of the student");
			score = keyboard.nextInt();
			if (score<0 || score>100)
			{
				System.out.println("Invalid score");
			}
			else
			{
				total = total + score;
				count++;
				System.out.println("What is the another student name? Type 'done' if no names to add.");
				name = keyboard.next();
			}
		}
		
		double average = total/count;
		System.out.println("The total average score of the class is: "+ average);
		
		keyboard.close();

	}

}
