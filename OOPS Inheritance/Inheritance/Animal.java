//Employee Id: 20450630
//Create a class named ‘Animal’ which includes methods like eat() and sleep().
Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().
Create an instance of Animal class and invoke the eat and sleep methods using this object.Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.

package javaProject;


class Animal
{
      public void eat()
      {
            System.out.println("Animal Eating");
      }
      
      public void sleep()
      {
            System.out.println("Animal Sleeping");
      }
}

public class Bird extends Animal
{
      
      public void eat()
      {
            System.out.println("Bird Eating");
      }
      
      public void sleep()
      {
            System.out.println("Bird Sleeping");
      }

      public void fly()
      {
            System.out.println("Bird Flying");
      }
      
      public static void main(String[] args)
      {
            Bird b=new Bird();
            b.eat();
            b.sleep();
            b.fly();
            
            System.out.println("==============================================");
            
            Animal a=new Animal();
            a.eat();
            a.sleep();
      }
}