import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Converting to lowercase to handle uppercase vowels
        ch = Character.toLowerCase(ch);

        // Using ternary operator to check if it's a vowel
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 
                        "Vowel" : "Not a Vowel";

        // Displaying the result
        System.out.println(result);

        scanner.close();
    }
}
