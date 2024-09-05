import java.util.*;
class Armstrong
{
  public static void main(String[]arg)
  {
    int rem, temp, sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number: ");
    int n=sc.nextInt();
    temp=n;
    while(n>0) 
    {
        rem=n%10;
        sum=sum+(rem*rem*rem);
        n=n/10;
    }
    if(sum==temp) 
    System.out.println(temp+" is a armstrong number");
    else 
    System.out.println(temp+" is Not a armstrong number");
                
  }
}
