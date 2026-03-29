//1. Write a Java program to accept an integer value from the user and convert it into a byte. 
//Display the result and observe the effect when the entered value exceeds the byte range.

package Lab_04;
import java.util.*;

public class IntToByte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        byte b = (byte) num; 
        System.out.println("Integer value: " + num);
        System.out.println("Converted byte value: " + b);
        sc.close();
    }
}