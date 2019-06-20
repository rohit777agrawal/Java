import java.util.Scanner;

public class FindHighestScore {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		double highestPercentage = 0.0;
		String name = null;
		
		for (int i=0; i<4; i++)
		{
			System.out.println("What is the student name?");
			String student = keyboard.nextLine();
			
			System.out.println("What is the score of the student?");
			double score = keyboard.nextDouble();
			
			keyboard.nextLine();
			
			if (score > highestPercentage)
			{
				highestPercentage = score;
				name = student;
			}
			
		}
		
		System.out.println(name + " got the higest percentage: " + highestPercentage);
		keyboard.close();
	}

}
