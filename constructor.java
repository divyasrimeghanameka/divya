import java.util.*;
class Student
{
   int rollno;
   String name;
   Student()
   {
     name="CSE";
     rollno=05;
   }
   Student(String str,int n)
   {
      name=str;
      rollno=n;
    }
   public static void main(String args[])
   {
      Student obj1=new Student();
      Student obj2=new Student("ECE",04);
      System.out.println(obj1.name);
      System.out.println(obj1.rollno);
      System.out.println(obj2.name);
      System.out.println(obj2.rollno);
    }
 }
      
      
