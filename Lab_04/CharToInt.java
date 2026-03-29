//7. Write a Java program to accept a character from the user, convert it into its corresponding integer value, and display the result.

package Lab_04;
import java.util.*;
public class CharToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int value = ch;
        System.out.println("Character: " + ch);
        System.out.println("Integer value: " + value);
        sc.close();
    }
}