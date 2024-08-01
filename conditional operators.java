import java.util.*;
class Cop
{
  public static void main(String[]args)
  {
   int a,b;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a,b, values:");
   a=sc.nextInt();
   b=sc.nextInt();
   int max=(a>b)?a:b;
   System.out.println("Max is "+max);   
  }
}
   
