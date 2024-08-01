import java.util.*;
class Lop
{
  public static void main(String[]args)
  {
   int a,b,c;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a,b,c values:");
   a=sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();
   System.out.println((a>b)&&(a!=c));
   System.out.println((a<=c)||(a==b));
   System.out.println((a!=b)&&(!(a>c)));
  }
}
   
