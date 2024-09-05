//implicit type coversion
import java.util.*;
class Wide
{
    public static void main(String args[])
    {
        int n=10;
        System.out.println("n value in int: "+n);
        double d=n;
        System.out.println("n value in double: "+d);
    }
}
//output:
n value in int: 10
n value in double: 10.0
  //explicit type conversion:
import java.util.*;
class Narrow
{
    public static void main(String args[])
    {
        double d=10.05;
        System.out.println("d value in double : "+d);
        int i=(int)d;
        System.out.println("d value in int: "+i);
        byte b=(byte)i;
        System.out.println("d value in byte is : "+b);
    }
}
//output:
d value in double : 10.05
d value in int: 10
d value in byte is : 10

