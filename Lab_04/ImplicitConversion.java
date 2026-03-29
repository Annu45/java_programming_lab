/*5. Write a Java program to accept two numbers from the user: 
one integer and one double. Perform addition and display the result after implicit type conversion.
 */
package Lab_04;
import java.util.*;
public class ImplicitConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int a = sc.nextInt();
        System.out.print("Enter double: ");
        double b = sc.nextDouble();
        double result = a + b; 
        System.out.println("Result: " + result);
        sc.close();
    }
}