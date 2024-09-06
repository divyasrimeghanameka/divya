import java.util.*;
 
class Palindrome
{
   static int rev(int n, int temp)
   {
     if (n == 0)
       return temp;
        temp = (temp * 10) + (n % 10);
        return rev(n / 10, temp);
   }
   public static void main (String[] args) 
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter n value:");
     int n=sc.nextInt();
     int temp = rev(n, 0);
     if (temp == n)
     System.out.println(temp+" is a palindrome");
     else
     System.out.println(temp+" is not a palindrome" );
   }
}
