//Employee Id: 20450630
/*Given a string of even length, return the first half. So the string "CatDog" yields "Cat". If the string length is odd number then return null.
*/

import java.util.Scanner;

public class Assignment04 {
	
	static String firstHalfString(String str) {
		if(str.length() % 2 == 0)
			return str.substring(0, str.length()/2);
		else 
			return "null";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		
		System.out.println(firstHalfString(str));
	}

}
