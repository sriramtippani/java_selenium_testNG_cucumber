//Employee Id: 20450630
//Create the following class and implement the method to check whether given string is a palindrome and return the result,
Class Name : MyUnit
Method : palindromeCheck(String):boolean

(Hint: If the reversed string is equal to the actual string is palindrome string. Ex: madam, mom, dad, malayalam )
ii) Create a Junit test class to test the above class.

package jun;

public class MyUnit
{

      public String Stringconcat(String s1,String s2)
      {
            return s1.concat(s2);
      }
      
      public boolean palindromeCheck(String str)
      {
            StringBuffer sb=new StringBuffer(str);
            String s2=new String(sb.reverse());
            if(str.matches(s2))
                  return true;
            else
                  return false;
            
      }
}