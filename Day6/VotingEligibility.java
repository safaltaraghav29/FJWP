import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        String result = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(result);
        sc.close();
    }
}
