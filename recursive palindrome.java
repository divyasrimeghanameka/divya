import java.util.*;
class Palindrome
{
  static boolean isPalindrome(String str)
  {
    if(str.length()<=1)
    {
      return true;
    }
    char first=str.charAt(0);
    char last=str.charAt(str.length()-1);
    if(first!=last)
    {
       return false;
    }
    else
    {
       String s=str.substring(1,str.length()-1);
       return isPalindrome(s);
    }
  }
  public static void main(String args[])
  {
    System.out.println("enter a string: ");
    Scanner sc=new Scanner(System.in);
    String v=sc.nextLine();
    System.out.println(isPalindrome(v));
  }
}
