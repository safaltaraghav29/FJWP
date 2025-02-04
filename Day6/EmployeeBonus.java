import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

               System.out.print("Enter employee's salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter employee's years of experience: ");
        int experience = scanner.nextInt();

                double bonus = (experience > 20) 
                        ? 0.2 * salary  
                        : 0.1 * salary;
                System.out.println("The bonus for the employee is: " + bonus);
    }
}
