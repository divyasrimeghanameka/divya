import java.util.*;
class Keyword
{
    int a=10;
    void display()
    {
        int a=20;
        System.out.println(a);
        System.out.println("value of a using this keyword is "+this.a);
    }
    public static void main(String args[])
    {
        Keyword obj=new Keyword();
        obj.display();
    }
}
