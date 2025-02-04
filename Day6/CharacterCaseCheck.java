import java.util.Scanner;

public class CharacterCaseCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking a character input
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Using ternary operator to check case
        String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase Letter" :
                        (ch >= 'a' && ch <= 'z') ? "Lowercase Letter" : 
                        "Not an Alphabet";

        // Display result
        System.out.println(result);

        scanner.close();
    }
}
