package Lab_03;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number:");
        int a = sc.nextInt();
        int factorial= 1;
        for(int i=1;i<a;i++){
            factorial =factorial*i;
        }
        System.out.println("The Factorial is :"+ factorial);
        sc.close();

    }
    
}
