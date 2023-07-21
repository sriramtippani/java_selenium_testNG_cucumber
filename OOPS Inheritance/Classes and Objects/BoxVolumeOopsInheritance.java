//Employee Id: 20450630
//Create a class Box that uses a parameterized method to initialize the dimensions of a box.(dimensions are width, height, depth of double type). The class should have a method that can return volume. Obtain an object and print the corresponding volume in main() function.

package javaProject;

import java.util.Scanner;

public class BoxVolumeOopsInheritance
{
      double width;
      double height;
      double depth;
      BoxVolumeOopsInheritance(double width, double height, double depth)
      {
            this.width = width;
            this.height = height;
            this.depth = depth;
      }
      double volume()
      {
            double result;
            result = width * height * depth;
            return result;
      }

      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter the Width: ");
            int w = sc.nextInt();
            
            System.out.println("Enter the height: ");
            int h = sc.nextInt();
            
            System.out.println("Enter the depth: ");
            int d = sc.nextInt();
            
            BoxVolumeOopsInheritance b = new BoxVolumeOopsInheritance(w, h, d);
            System.out.println("Result of the Volume: " + b.volume());
      }

}