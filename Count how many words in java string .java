import java.util.Scanner;

public class WordCounter 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();
        if (input.trim().isEmpty()) 
        {
            System.out.println("The number of words is: 0");
        } else
        {
            String[] words = input.trim().split("\\s+");
            System.out.println("The number of words is: " + words.length);
        }
    }
}
