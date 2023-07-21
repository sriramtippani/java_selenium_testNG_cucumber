//Employee Id: 20450630
//Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. Here’s what the class should do: 
1. Construct a class called Patient
2. Store a String name for the patient
3. Store weight and height for patient as doubles
4. Construct a new patient using these values
5. Write a method called BMI which returns the patient’s BMI as a double. BMI can be calculated as BMI = ( Weight in Pounds / ( Height in inches x Height in inches ) ) x 703
6. Next, construct a class called “Patients” and create a main method. Create a Patient object and assign some height and weight to that object. Display the BMI of that patient.

package javaProject;

import java.util.Scanner;

public class PatientVitalStatistics
{
      String name;
      double weight;
      double height;
      PatientVitalStatistics(String name, double weight, double height)
      {
            this.name = name;
            this.weight = weight;
            this.height = height;
      }
      
      double BMI()
      {
            double bmi;
            bmi = ((weight / (height * height ) ) * 703);
            return bmi;
      }

      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter the name of the patient: ");
            String str = sc.next();
            
            System.out.println("Enter the Weight of the patient: ");
            int num1 = sc.nextInt();
            
            System.out.println("Enter the height of the patient: ");
            int num2 = sc.nextInt();
            
            PatientVitalStatistics p = new PatientVitalStatistics(str, num1, num2);
            System.out.println("The name of the patient " + str + " weight is " + num1 + " height is " + num2 + "\nBMI " + p.BMI());
      }
}