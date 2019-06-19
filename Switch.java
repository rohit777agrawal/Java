
public class Switch {
	
	public static void main (String[] args)
	{
		printDayOfTheWeek(3);
	}
	
	public static void printDayOfTheWeek (int day)
	{
		switch (day)
		{
		case 0:
			System.out.println("Sunday");
			break;
		
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		default:
			System.out.println("Invalid day");
			
		}
	}
		
		
		
/**		char name = 'E';
		
		switch (name) 
		{
		case 'A':
			System.out.println("A");
			break;
			
		case 'B':
			System.out.println("B");
			break;
			
		case 'C':
			System.out.println("C");
			break;
			
		case 'D':
			System.out.println("D");
			break;
			
		case 'E':
			System.out.println("E");
			break;
			
		default:
			System.out.println("No char");
			break;
		
		}  **/
	

}
