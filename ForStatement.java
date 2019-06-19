
public class ForStatement {
	
	public static void main (String[] args)
	{
		int count =0;
		int add=0;
		
		for (int number =1; number<=1000; number++)
		{
			if (number%3 == 0 && number%5 ==0)
			{
				add+= number;
				count++;
				System.out.println("Found number" + number);
			}
			if (count ==5)
			{
				break;
			}
		}
		System.out.println("The sum is: " + add);
		
		
	}

}
