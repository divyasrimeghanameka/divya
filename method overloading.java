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
