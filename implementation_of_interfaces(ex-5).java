import java.util.*;
  interface A
  {
    void ShowA();
  }
  interface B
  {
    void ShowB();
  }
  interface C
  {  
    void ShowC();
  }
  class D implements A,B,C
  {
    public static void main(String[]args)
    {
      D obj=new D();
      obj.ShowA();
      obj.ShowB();
      obj.ShowC();
    }
    public void ShowA()
    {
      System.out.println("Interface A");
    }
    public void ShowB()
    {
      System.out.println("Interface B");
    }
    public void ShowC()
    {
      System.out.println("Interface C");
    }
  }
