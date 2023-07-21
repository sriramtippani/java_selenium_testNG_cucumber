//Employee Id: 20450630
//Create  a base class Fruit which has name ,taste and size as its attributes. A method called eat() is created which describes the name of the fruit and its taste.  Inherit the same in 2 other class Apple and Orange and override the eat() method to represent each fruit taste.

package javaProject;

import java.util.Scanner;

class Fruit
{
      String name;
      String taste;
      public void eat()
      {
            System.out.println("Eating Fruits");
            System.out.println("------------------------");
      }
}

class Apple extends Fruit
{
      Apple()
      {
            name = "Apple";
            taste = "oder";
      }
      public void eat()
      {
            System.out.println("The name of the fruit is: " + name);
            System.out.println("The Taste of the " + name + " is: " + taste);
            System.out.println("------------------------");
      }
}

class Orange extends Fruit
{
      Orange()
      {
            name = "Orange";
            taste = "sweet";
      }
      public void eat()
      {
            System.out.println("The name of the fruit is: " + name);
            System.out.println("The Taste of the " + name + " is: " + taste);
            System.out.println("------------------------");
      }
}

public class FruitInheritance
{

      public static void main(String[] args)
      {
            Apple a = new Apple();
            Orange o = new Orange();
            Fruit f = new Fruit();
            f.eat();
            a.eat();
            o.eat();

      }

}