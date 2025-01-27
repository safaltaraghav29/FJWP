import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks obtained: ");
        double marksObtained = scanner.nextDouble();


        System.out.print("Enter total marks: ");
        double totalMarks = scanner.nextDouble();

        
        double percentage = (marksObtained / totalMarks) * 100;

       
        System.out.println("Percentage: " + percentage + "%");

     
        scanner.close();
    }
}
