import java.util.*;
class Morning implements Runnable
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
class Hello implements Runnable
{
    public void run()
    {
        try
        {
            while(true)
            {
                System.out.println("Hello");
                Thread(2000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
class Welcome implements Runnable
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
    Thread t1=new Thread(new Morning());
    Thread t2=new Thread(new Hello());
    Thread t3=new  Thread(new Welcome());
    t1.start();
    t2.start();
    t3.start();
}
