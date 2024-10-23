import java.lang.*;
class Except
{
    public static void main(String[]args)
    {
        try{
            int a[]={1,2,4,6};
            System.out.println(a[7]);
        }
        catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println("Array index out of bounds exception");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Ae");
        }
        catch(Exception e)
        {
            System.out.println("E");
        }
    }
}
