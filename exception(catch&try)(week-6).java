import java.lang.Exception;
class Try 
{
  public static void main(String[]args)
  {
     try
     {
     int a=20;
     int b;
     for(b=10;b>=0;b--)
     {
       System.out.println(a/b);
     }
     }
     catch(ArithmeticException e)
     {
        System.out.println(e.toString());
        }
  }
}
/*output
2
2
2
2
3
4
5
6
10
20
java.lang.ArithmeticException: / by zero*/
