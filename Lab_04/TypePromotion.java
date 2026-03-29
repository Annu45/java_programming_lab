//6. Write a Java program to demonstrate type promotion by multiplying two byte variables and storing the result in an integer variable. Display the result.
package Lab_04;
import java.util.Scanner;
public class TypePromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextByte();
        System.out.println("Enter second number:");
        int b = sc.nextByte();
        int result = a * b; // promoted to int
        System.out.println("Result: " + result);
        sc.close();
    }
}
