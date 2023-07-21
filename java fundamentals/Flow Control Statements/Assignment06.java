//Employee Id: 20450630
/*Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.

If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.

If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.

If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.

If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.
*/

public class Assignment06 {

	public static void main(String[] args)
 {
		String gender=args[0];
		int age=Integer.parseInt(args[1]);

		if(gender.equalsIgnoreCase("Female")) {

		   if(age>=1&&age<=58)
		        System.out.println("Interest=8.2%");

			else if(age>58&&age<=100)
			    System.out.println("Interest=9.2%");

		}
		
		else {

		       if(age>=1&&age<=58)
			      System.out.println("Interest=8.4%");

		       else if(age>58&&age<=100)
			       System.out.println("Interest=10.5%");

		}

	}

}
