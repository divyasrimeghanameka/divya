import java.util.*;
class Strong
{
  public static void main(String[]args)
  {
     int rem, temp, sum=0;
     int fact,i;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number: ");
     int n=sc.nextInt();
     temp=n;
     while(n>0) 
     {
       i=1;
       fact=1;
       rem=n%10;
       while(i<=rem)
       {
          fact*=i;
          i++;
        }
        sum+=fact;
        n=n/10;
      }
      if(sum==temp)
      System.out.println(temp+" is a strong number");
      else 
      System.out.println(temp+" is Not a strong number");
  }          
}
