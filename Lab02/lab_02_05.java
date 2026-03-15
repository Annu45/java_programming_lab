package Lab02;
import java.util.Scanner;
public class lab_02_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("a AND b :"+ (a&b));
        System.out.println("a OR b :"+(a|b));
        System.out.println("a XOR b :"+(a^b));
        sc.close();
    }
    
}
