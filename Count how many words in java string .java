import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Check if the input is empty
        if (input.trim().isEmpty()) {
            System.out.println("The number of words is: 0");
        } else {
            // Split the string by whitespace and count the words
            String[] words = input.trim().split("\\s+");
            System.out.println("The number of words is: " + words.length);
        }
    }
}
