package Lab_03;
import java.util.Scanner;
public class largestOfThreeNumbers {
    public static int largest(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }else if(b>a && b>c){
            return b;
        }else{
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ist number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number:");
        int c = sc.nextInt();
        int result = largest(a, b, c);
        System.out.println("The laregst number is :"+result);
        sc.close();


        
    }
    


    
}
