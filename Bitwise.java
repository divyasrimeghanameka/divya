import java.util.*;
class Bop
{
  public static void main(String[]args)
  {
   int a,b;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a,b, values:");
   a=sc.nextInt();
   b=sc.nextInt();
   System.out.println("performing bitwise AND:"+(a&b));
   System.out.println("Bitwise OR:"+(a|b));
   System.out.println("Bitwise X-OR:"+(a^b));
   System.out.println("complement of a:"+(~a));
   System.out.println("left shift of a:"+(a<<1));
   System.out.println("left shift of a:"+(a<<2));
   System.out.println("right shift of b:"+(b>>1));
   System.out.println("right shift of b:"+(b>>3));       
  }
}
   
