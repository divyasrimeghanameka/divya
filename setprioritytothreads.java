import java.util.*;
class Morning extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<4;i++)
            {
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
class Hello extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<4;i++)
            {
                System.out.println("Hello");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
class Welcome extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<4;i++)
            {
                System.out.println("Welcome");
                Thread.sleep(3000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
public class Main
{
    public static void main(String[]args)
    {
        Morning t1=new Morning();
        Hello t2=new Hello();
        Welcome t3=new Welcome();
        t1.setPriority(Thread.MIN_PRIORITY);  // Minimum priority for t1
        t2.setPriority(Thread.NORM_PRIORITY); // Normal priority for t2
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
