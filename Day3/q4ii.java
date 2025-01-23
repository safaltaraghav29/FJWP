import java.util.Scanner;
class q4ii
{
public static void main(String args[])
{
float pi = 3.14f;
//float r = 3.4f;
Scanner sc=new Scanner(System.in);
System.out.print("Enter radius : ");
float r=sc.nextFloat();
float area = pi*r*r;
System.out.println("Area of Circle : "+area);
}
}