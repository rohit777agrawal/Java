package DoWhileLoop;

import java.util.Scanner;

public class DoWhileLoop {
	@SuppressWarnings( "resource" )
	public static void main(String[] args){
		
		String word;
		boolean statement = true;
		do{
			System.out.println("Enter a word");
			Scanner keyboard = new Scanner(System.in);
			word = keyboard.next();
			String Word = word.toLowerCase();
			if (Word.equalsIgnoreCase("done")){
				System.exit(0);
			}
			int length = Word.length();
			char s1 = Word.charAt(0);
			char s2 = Word.charAt(length-1);
			
			if (s1 == s2){
				System.out.println("The first and last letter are equal.");
			}
			else{
				System.out.println("The first and last letter are not equal.");
			}
		
		}while(statement);
		
	}
}
