import java.util.Scanner;

public class Trivia {
	
	public String question;
	public String answer;
	Scanner keyboard = new Scanner (System.in);
	
	public void firstquestion ()
	{
		boolean statement = true;
		while (statement)
		{
			String answerOne;
			question = "Which team won the Fifa World Cup in 2010?";
			System.out.println(question);
			answerOne = keyboard.nextLine();
			String answer = answerOne.toLowerCase();
			
			if (answer.equals("spain"))
			{
				System.out.println(answer + " is correct!");
				statement = false;
			}
			else 
			{
				System.out.println("It is incorrect");
		}
		}
		
	}
	
	public void secondquestion ()
	{
		boolean sentence = true;
		while (sentence)
		{
			String answersecond;
			question = "Which team won the Fifa World Cup in 2014?";
			System.out.println(question);
			answersecond = keyboard.nextLine();
			String copyAnswersecond = answersecond.toLowerCase();
			
			if (copyAnswersecond.equals("germany"))
			{
				System.out.println(answersecond + " is correct!");
				sentence = false;
			}
			else 
			{
				System.out.println("It is incorrect");
			}
		}
		
	}
	

}
