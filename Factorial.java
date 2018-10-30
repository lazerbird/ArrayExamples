import java.util.Scanner;
public class Factorial
{
 public static void main (String[] args)
 {
 Scanner s = new Scanner(System.in);
 System.out.print(" Type in a small integer : ");
 int n = s.nextInt();
 int answer= factorial(n);
 System.out.println("Answer is "+answer);
 }
 
 public static int factorial( int n)
 {
 System.out.println(n);
 
 // Stopping condition. VERY important
 if (n<=1)
 return n;
 
 // factorial(n)=n*factorial(n-1)
 return n*factorial(n-1);
 
 }
}