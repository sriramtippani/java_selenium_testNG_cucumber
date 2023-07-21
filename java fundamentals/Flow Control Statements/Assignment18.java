//Employee Id: 20450630
//Given number is prime or not
package java_project;

import java.util.Scanner;

public class Assignment18 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is prime | not: ");
		int number = sc.nextInt();
		
		if(number % 2 == 0)
		{
			System.out.println(number + " is a Prime Number");
		}
		else
		{
			System.out.println(number + " is not a Prime Number");
		}
	}

}
