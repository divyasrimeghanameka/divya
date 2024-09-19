import java.util.*;
class Buffer
{
   public static void main(String[]args)
   {
      StringBuffer sb=new StringBuffer("java");
      System.out.println("String: "+sb);
      sb=sb.delete(1,3);
      System.out.println("after deleting: "+sb);
   }
}
      
