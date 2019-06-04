package WhileLoop;

import java.util.Scanner;

public class WhileLoop {
	@SuppressWarnings( "resource" )
	public static void main(String[] args){
		
		boolean statement = true;
		String word;
		Scanner keyboard = new Scanner(System.in);
		
		while(statement)
		{
			System.out.println("Enter a word and I will check if first and last letter of word is equal or not.");
			word = keyboard.next();
			String Word = word.toLowerCase();
			
			if (Word.equals("done")){
				System.exit(0);
			}
			
			int length = Word.length();
			char s1 = Word.charAt(0);
			char s2 = Word.charAt(length-1);
			
			if (s1 == s2)
			{
				System.out.println("The first and last letter are equal.");
			}
			else
			{
				System.out.println("The first and last letter are not equal.");
			}
		
		}
		
	}
}
