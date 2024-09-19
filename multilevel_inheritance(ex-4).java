import java.util.*;
class A
{
   public void methodA()
   {
      System.out.println("Class A");
   }
}
class B extends A
{
   public void methodB()
   {
      System.out.println("Class B");
   }
}
class C extends B
{
   public void methodC()
   {
      System.out.println("Class C");
   }
   public static void main(String[]args)
   {
      C obj=new C();
      obj.methodA();
      obj.methodB();
      obj.methodC();
   }
}
