import java.util.Scanner;

public class AddToASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

              int updatedAsciiValue = (int) inputChar + 32;

             char updatedChar = (char) updatedAsciiValue;


        System.out.println("The character after adding 32 to its ASCII value is: " + updatedChar);

        scanner.close();
    }
}
