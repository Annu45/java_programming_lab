package Lab02;
import java.util.Scanner;
public class lab_02_09 {
    public static int fact(int a){
        if(a==0 || a==1){
            return 1;
        }
        return a*fact(a-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number:");
        int a = sc.nextInt();
        int res = fact(a);
        System.out.println("factorial is :"+res);
        sc.close();

        
    }
    
}
