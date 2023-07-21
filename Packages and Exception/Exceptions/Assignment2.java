//Employee Id: 20450630
//Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index.
 This program may generate Array Index Out Of Bounds Exception. Use exception handling mechanisms to handle this exception. In the catch block, print the class name of the exception thrown.
Sample Input and Output 1:
Enter the number of elements in the array
3
Enter the elements in the array
20
90
4
Enter the index of the array element you want to access
2
The array element at index 2 = 4
The array element successfully accessed

 Sample Input and Output 2:
Enter the number of elements in the array
3
Enter the elements in the array
20
90
4
Enter the index of the array element you want to access
6
java.lang.ArrayIndexOutOfBoundsException


package javaProject;

import java.util.Scanner;

public class Assignment2
{

      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            
            try
            {
            
                  System.out.println("Enter the number of values: ");
                  int num = sc.nextInt();
                  
                  int arr[] = new int[num];
                  System.out.println("Enter the value of the array: ");
                  for(int i=0; i<arr.length; i ++)
                  {
                        arr[i] = sc.nextInt();
                  }
                  
                  System.out.println("Enter the particular value of the index: ");
                  int num1 = sc.nextInt();
                  
                  System.out.println("The Result of index " + num1 + " is: " + arr[num1]);
                  System.out.println("The Entered array accessed successfully");
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                  System.out.println("Array index out of bounds Exception");
                  System.out.println("Class name of the exception thrown: " + e.getClass().getName());
            }
            catch(Exception e)
            {
                  System.out.println("An error occured: " + e);
            }
      }
}
