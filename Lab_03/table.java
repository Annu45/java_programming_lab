package Lab_03;
import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number:");
        int a = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i +"x" +a+" is "+(i*a));
        }
        sc.close();
    }
    
}
