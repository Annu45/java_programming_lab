package Lab_02;
import java.util.Scanner;
public class lab_02_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println(a +" divided by "+ b +" gives remainder :"+(a%b));
        sc.close();
        
    }
    
}
