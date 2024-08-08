import java.util.*;
class Max
{
  public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number: ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(a>b)
    {
      System.out.println(a+" is maximum");
      System.out.println(b+" is minimum");
    }
    else
    {
      System.out.println(b+" is maximum");
      System.out.println(a+" is minimum");
      
    }
     
  }
}
     
