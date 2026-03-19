/*Write a Java program to calculate grade based on marks:

	•	90+ → A
	•	75–89 → B
	•	50–74 → C
	•	Below 50 → Fail
*/
package Lab_03;
import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your marks:");
        int a = sc.nextInt();
        if(a>90){
            System.out.println("Your grade is : A");
        }else if(a>75 || a<89){
            System.out.println("Your grade is :B ");
        }else if(a>50 || a<74){
            System.out.println("Your Grade is C ");
        }else{
            System.out.println("You are Fail");
        }
        sc.close();
    }
    
}
