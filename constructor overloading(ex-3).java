import java.util.*;
class A
{
  A()
  {
    System.out.println("Constructor");
  }
  A(int a)
  {
    System.out.println("a value is "+a);
  }
  public static void main(String args[])
  {
    A obj1=new A();
    A obj2=new A(10);
  }
}
    
