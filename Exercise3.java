//Exercise3
/* asks the user to enter their name, weight, height and address. 
 *The program should then display the values to the users*/   



import java.util.Scanner ;

public class Exercise3 {
	public static void main(String args[])
	{
		String name, address ;
			Float weight, height ;
		
			
	Scanner input = new Scanner(System.in);
	
	System.out.print("Please enter your name:");
	name = input.nextLine();
	
	System.out.print("Please enter your weight:");
	weight = input.nextFloat();
	
	System.out.print("Please enter your height:");
	height = input.nextFloat();
	
		System.out.print("Please enter your Address:");
	    input.nextLine();
	    address = input.nextLine();
	
		}
}