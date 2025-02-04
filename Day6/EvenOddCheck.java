import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Using ternary operator to check even or odd
        String result = (num % 2 == 0) ? "Even Number" : "Odd Number";

        // Displaying the result
        System.out.println("Result: " + result);

        scanner.close();
    }
}
