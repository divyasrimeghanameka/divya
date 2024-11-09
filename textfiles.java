import java.io.*;
public class fos
{
    public static void main(String[]args)throws FileNotFoundException,IOException
    {
        FileOutputStream fos=new FileOutputStream("abc.txt");
        fos.write(5);
        System.out.println("sucess");
        fos.flush();
        fos.close();
    }
}
output:success
reading textfiles
import java.io.*;
public class fis
{
    public static void main(String[]args)throws FileNotFoundException,IOException
    {
        FileInputStream fis=new FileInputStream("bbc.txt");
        int data;
        while((data=fis.read())!=-1);
        {
             System.out.println("data:"+(char)data));
        }
        fis.close();
    }
}
output of the program if file bbc contain hi text
 the output of the program will be:
105
