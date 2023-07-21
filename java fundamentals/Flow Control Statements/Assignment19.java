//Employee Id: 20450630
//Write a program that displays a menu with options 1. Add 2. Sub
Based on the options chosen, read 2 numbers and perform the relevant operation. After performing the operation, the program should ask the user if he wants to continue. If the user presses y or Y, then the program should continue displaying the menu else the program should terminate.

package java_project;

import java.util.Scanner;

public class Assignment19 
{

	public static void main(String[] args) 
	{
		do
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the option to (add/substract) two numbers: ");
		    String option = sc.next();
		
		    System.out.println("Enter the number1: ");
		    int number1 = sc.nextInt();
		
		    System.out.println("Enter the number2: ");
		    int number2 = sc.nextInt();
		    if((option.toLowerCase()).equals("add"))
		    {
		    	System.out.println("The sum of " + number1 + " and " + number2 + " is: " + number1 + number2);
		    }
		    else
		    {
		    	System.out.println(number1 - number2);
		    }
		    
		    System.out.println("Enter the option to click (y/n) to continue the process: ");
		    String click = sc.next();
		    if((click.toLowerCase()).equals("y"))
		    {
		    	continue;
		    }
		    else
		    {
		    	System.out.println("Thank you for your process");
		    	break;
		    }
		}
		while(true);
	}
}
