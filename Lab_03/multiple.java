package Lab_03;
import java.util.Scanner;

public class multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        if(a%10==0){
            System.out.println(a+" is a multiple of 10");
        }else{
            System.out.println(a+" is not a multiple of 10");
        }
        sc.close();
    }
    
}
