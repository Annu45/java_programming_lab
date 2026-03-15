package Lab_01;
import java.util.Scanner;
public class SecondProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter your name:");
         String name = sc.nextLine();
         System.out.println("Enter your roll no:");
         String roll = sc.nextLine();
         System.out.println("Enter your Department");
         String dept = sc.nextLine();
         System.out.println("Enter your email");
         String email = sc.nextLine();
         System.out.println("Your name is :"+name);
         System.out.println("Your roll number is :"+roll);
         System.out.println("Your department is :"+dept);
         System.out.println("Your email is :"+email);
         sc.close();


        
    }

    
}
