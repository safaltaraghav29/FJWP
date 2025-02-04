import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Using ternary operator to check the number type
        String result = (num > 0) ? "Positive Number" :
                        (num < 0) ? "Negative Number" :
                        "Zero";

        // Displaying the result
        System.out.println(result);

        scanner.close();
    }
}
