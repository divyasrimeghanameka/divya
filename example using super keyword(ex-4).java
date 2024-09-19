import java.util.*;
class Employee
{
   float salary=10000;
}
class Hr extends Employee
{
   float salary=20000;
   void method()
   {
      System.out.println("salary is: "+super.salary);
   }
   public static void main(String[]args)
   {
      Hr obj=new Hr();
      obj.method();
   }
}
