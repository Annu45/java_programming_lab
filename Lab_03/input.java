package Lab_03;
import java.util.Scanner;
public class input {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num;
        do {
            num = sc.nextInt();
        } while (num != 0);
        sc.close();
    }
    
}
