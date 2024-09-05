import java.util.*;
class Largest
{
   public static void main(String[]args)
   {
      int a,b,c;
      Scanner sc=new Scanner(System.in);   
      System.out.println("enter a, b, c values: ");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      if(a>b && a>c)
      {
        System.out.println(a+" is the largest number.");
      }
      else if(b>a && b>c)
      {
        System.out.println(b+" is the largest number.");
      }
      else
      {
        System.out.println(c+" is the largest number.");
      }
   }
}
