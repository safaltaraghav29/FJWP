import java.util.Scanner;

public class SquareOfDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a double number: ");
        double number = scanner.nextDouble();

               double square = number * number;


        System.out.println("The square of " + number + " is: " + square);

        scanner.close();
    }
}
