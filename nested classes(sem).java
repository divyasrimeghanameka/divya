class A
{
   public void methodA()
   {
      System.out.println("Parent class");
   }
}

class B extends A
{
   public void methodB()
   {
      System.out.println("Child class");
   }
   static class NestedB {
      public void methodNestedB() {
         System.out.println("Nested class inside B");
      }
   }

   public static void main(String[] args)
   {
      B obj = new B();
      obj.methodA();  
      obj.methodB();  
      B.NestedB nestedObj = new B.NestedB();
      nestedObj.methodNestedB(); 
   }
}
output:
Parent class
Child class
Nested class inside B
