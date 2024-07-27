import java.util.*;
class Qr
{
   public static void main(String[]args)
   {
      double a;
      double b;
      double c;
      double r1;
      double r2;
      Scanner sc=new Scanner (System.in);
      System.out.println("enter coefficient of a,b,c:");
      a=sc.nextDouble();
      b=sc.nextDouble();
      c=sc.nextDouble();
      double D=b*b-4*a*c;
      System.out.println("discriminant D= "+D);
      if(D>0)
      {
         System.out.println("The 2 roots are real and distinct");
         r1=(-b+Math.sqrt(D))/(2*a);
         r2=(-b-Math.sqrt(D))/(2*a);
         System.out.println("the roots are:"+r1+"and"+r2);
      }
      else if(D==0)
      {
         System.out.println("it has only  one root are it is real and equal");
         r1=-b/2*a;
         System.out.println("the root of equation is:"+r1); 
      }
      else
      {
         System.out.println("The roots are imaginary");
      }
   }
}
