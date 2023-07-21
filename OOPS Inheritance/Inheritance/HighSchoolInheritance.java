//Employee Id: 20450630
//A HighSchool application has two classes: the Person superclass and the Student subclass. Using inheritance, in this lab you will create two new classes, Teacher and CollegeStudent. A Teacher will be like Person but will have additional properties such as salary (the amount the teacher earns) and subject (e.g. “Computer Science”, “Chemistry”,  “English”, “Other”). The CollegeStudent class will extend the Student class by adding a year (current level in college) and major (e.g. “Electrical Engineering”, “Communications”, “Undeclared”).

package javaProject;

import java.util.Scanner;

class Person
{
      Scanner sc = new Scanner(System.in);
      
      int age;
      String name;
      String gender;
      
      void personData()
      {
            System.out.println("Enter age: ");
            age = sc.nextInt();
            
            System.out.println("Enter Name: ");
            name = sc.next();
            
            System.out.println("Enter Gender: ");
            gender = sc.next();
      }
}

class Student extends Person
{
      Scanner sc = new Scanner(System.in);
      
      int RegisterNo;
      double CGPA;
      String department;
      
      void StudentData()
      {
            System.out.println("Enter Registeration Number: ");
            RegisterNo = sc.nextInt();
            
            System.out.println("Enter CGPA: ");
            CGPA = sc.nextDouble();
            
            System.out.println("Enter Department: ");
            department = sc.next();
      }
}

class Teacher extends Person
{
      Scanner sc = new Scanner(System.in);
      
      int salary;
      String subject;
      
      void TeacherData()
      {
            System.out.println("Enter salary: ");
            salary = sc.nextInt();
            
            System.out.println("Enter subject: ");
            subject = sc.next();
      }
      
      void PersonDisplay()
      {
            System.out.println("-------------------------------");
            System.out.println("The Age: " + age);
            System.out.println();
            System.out.println("The Name: " + name);
            System.out.println();
            System.out.println(" The Gender(Male/Female): " + gender);
            System.out.println();
            System.out.println("The salary: " + salary);
            System.out.println();
            System.out.println("The subject: " + subject);
            System.out.println("-------------------------------");
            
      }
}

class CollegeStudent extends Student
{
      Scanner sc = new Scanner(System.in);
      
      String majorSubject;
      int passoutyear;
      
      void collegeStudentData()
      {
            System.out.println("Enter Major subject: ");
            majorSubject = sc.nextLine();
            
            System.out.println("Enter Year of passed out: ");
            passoutyear = sc.nextInt();
      }
      
      void DisplayCollegeStudent()
      {
            System.out.println("-------------------------------");
            System.out.println("The Registration number: " + RegisterNo);
            System.out.println();
            System.out.println("The CGPA: " + CGPA);
            System.out.println();
            System.out.println(" The Department: " + department);
            System.out.println();
            System.out.println("The Major Subject: " + majorSubject);
            System.out.println();
            System.out.println("The Passout year: " + passoutyear);
            System.out.println("-------------------------------");
      }
}

public class HighSchoolInheritance
{

      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            
            Teacher t = new Teacher();
            t.personData();
            t.TeacherData();
            t.PersonDisplay();
            
            CollegeStudent c = new CollegeStudent();
            c.StudentData();
            c.collegeStudentData();
            c.DisplayCollegeStudent();

      }
}