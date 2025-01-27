import java.util.Scanner;
class LogicalDemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.print("Enter three values :");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

boolean result = a>b && a>c;
System.out.println("A is greatest : "+result);

System.out.println("B is greatest : "+(b>a && b>c));
System.out.println("c is greatest : "+(c>a && c>b));
}
}
