//Employee Id: 20450630
//Write a program to check if a given integer number is Positive, Negative, or Zero.

import java.util.Scanner;

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int num = scan.nextInt();
		
		if(num > 0) {
			System.out.println("Number is Positive");
		}
		else if(num < 0) {
			System.out.println("Number is Negative");
		}
		else {
			System.out.println("Number is Zero");
		}
		
	}

}




//Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.

lastDigit(7,17)---true
lastDigit(6,17)---false
lastDigit(3,113)---true


import java.util.Scanner;
class LastDEqual
{
  public static void main(String args[])
  {
     int num1,num2;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter two numbers:");
     num1=sc.nextInt();
     num2=sc.nextInt();
	if(num1%10==num2%10)
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
  }
}
