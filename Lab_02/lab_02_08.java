package Lab_02;
import java.util.Scanner;

public class lab_02_08 {
    public static void largest(int a,int b){
        if(a>b){
            System.out.println(a+" is greater");
        }else{
            System.out.println(b+" is greater");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        largest(a, b);
        sc.close();

    }
    
}
