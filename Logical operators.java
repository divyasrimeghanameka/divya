import java.util.*;
class Lop
{
  public static void main(String[]args)
  {
   int a,b;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a,b values:");
   a=sc.nextInt();
   b=sc.nextInt();
   System.out.println((a>b)&&(a!=b));
   System.out.println((a<=b)||(a==b));
   System.out.println((a!=b)&&(!(a>b)));
  }
}
   
