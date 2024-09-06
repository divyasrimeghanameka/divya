import java.util.*;
class Keyword
{
    static int n=5;
    static void display()
    {
        System.out.println("static method");
    }
    static
    {
        System.out.println("static block");
    }
    public static void main(String[]args)
    {
        System.out.println(n);
        display();
    }
}
//output
static block
5
static method


