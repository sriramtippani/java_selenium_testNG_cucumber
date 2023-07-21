//Employee Id: 20450630
//Create a class Employee and implement the below method in the class.
Write Junit testcases to test the below given method:

public String findName(ArrayList employees,String name){
  String result="";
  if(employees.contains(name)){
   result="FOUND";
  }else{
   result="NOT FOUND";
  }
  return result;
 }

package jun;

import java.util.ArrayList;

public class Employee
{

      public String findName(ArrayList employees,String name)
      {
            String result="";
            if(employees.contains(name))
            {
                  result="FOUND";               
            }
            else
            {
                  result="NOT FOUND";
            }
            return result;
      }
}