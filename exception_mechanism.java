import java.lang.*;
class Except
{
    public static void main(String[]args)
    {
        try
        {
            int a[]={1,23,18,16,32};
            System.out.println(a[7]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("finally block executed");
        }
        try
        {
            validate(18);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
        public static void validate(int age)
        {
            if(age<18)
            {
                throw new ArithmeticException("not eligible");
            }
            else
            {
                System.out.println("eligible");
            }
        }
}
output
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5
finally block executed
eligible

