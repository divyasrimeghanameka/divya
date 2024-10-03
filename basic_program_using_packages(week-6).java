//package
package cse;
public class PackDemo
{
   public void show()
   {
      System.out.println("this is user-defined package");
   }
}
//program using above package
import cse.PackDemo;
class A
{
   public static void main(String[]args)
   {
     PackDemo obj = new PackDemo();
     obj.show();
   }
}
/*compilation steps
javac -d . PackDemo.java
javac A.java
java A*/
/*output
this is user-defined package*/
