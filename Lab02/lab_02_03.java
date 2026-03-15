package Lab02;
import java.util.Scanner;
public class lab_02_03 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        int a = sc.nextInt();
        System.out.println("Enter the breadth of rectangle:");
        int b = sc.nextInt();
        System.out.println("Area is:"+(a*b));
        System.out.println("perimeter is"+(2*(a+b)));
        sc.close();
        
    }
    
}
