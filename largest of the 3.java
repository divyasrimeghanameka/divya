import java.util.*;
class Largest
{
   public static void main(String[]args)
   {
      int a,b,c;
      System.out.println("enter a, b, c values: ");
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      if(a>b)
      {
         if(a>c)
         System.out.println(a+" is largest number.");
         else
         System.out.println(c+" is largest number.");
      }
      else
      { 
         if(b>a)
         System.out.println(b+" is largest number.");
         else
         System.out.println(c+" is the largest number.");
         
      }
   }
}
