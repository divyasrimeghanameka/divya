import java.util.*;
class Idop
{
  public static void main(String[]args)
  {
   int a,b;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a,b, values:");
   a=sc.nextInt();
   b=sc.nextInt();
   a++;
   --b;
   a=a+b;
   System.out.println("a is equal to "+a);
   System.out.println("b is equal to "+b);
  }
}
   
