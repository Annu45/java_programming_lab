package Lab02;
import java.util.Scanner;
public class lab_02_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();
        System.out.println("The average of three numbers is :"+((a+b+c)/2));
        sc.close();

        
    }
    
}
