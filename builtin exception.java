import java.lang.*;
class Excep
{
    public static void main(String[]args)
    {
        try
        {
            int a=10/0;
            System.out.println(a);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Arithmetic exception");
        }
        try
        {
            int a[]={1,2,3,4,5};
            System.out.println(a[7]);
        }
        catch(ArrayIndexOutOfBoundsException aiobe)
        {
            System.out.println("Array index out of bounds");
        }
        try
        {
            String str=null;
            int length=str.length();
        }
        catch(NullPointerException npe)
        {
            System.out.println("npe");
        }
    }
}
output:
Arithmetic exception
Array index out of bounds
npe
