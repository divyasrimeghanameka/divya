import java.util.*;
public class Mul
{
  void Mul(int a,int b)
  {
     System.out.println("Multiplication is "+(a*b));
  }
  void Mul(int a,int b,int c)
  {
     System.out.println("Mul is "+(a*b*c));
  }
  public static void main(String args[])
  {
    Mul obj=new Mul();
    obj.Mul(4,5);
    obj.Mul(4,5,6);
   }
}
//using scanner class
import java.util.*;
public class Mul
{
    void Mul(int a, int b)
    {
        System.out.println("Multiplication is "+(a*b));
    }
    void Mul(int a, int b, int c)
    {
        System.out.println("Multiplication is "+(a*b*c));
    }
    public static void main(String[]args)
    {
        Mul obj=new Mul();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a,b values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        obj.Mul(a,b);
        System.out.println("enter c,d,e value:");
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        obj.Mul(c,d,e);
    }
}
