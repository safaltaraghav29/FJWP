import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        // Using ternary operator to check pass or fail (Assuming passing marks is 40)
        String result = (marks >= 40) ? "Pass" : "Fail";

        // Displaying the result
        System.out.println("Result: " + result);

        scanner.close();
    }
}
