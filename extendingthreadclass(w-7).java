import java.util.*;
class Morning extends Thread
{
    public void run()
    {
        try
        {
            while(true)
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
            while(true)
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
            while(true)
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
public class Excep
{
    public static void main(String[]args)
    {
        MorningThread t1=new MorningThread();
        HelloThread t2=new HelloThread();
        WelcomeThread t3=new WelcomeThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
