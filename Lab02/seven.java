package Lab02;
import java.util.Scanner;

class Seven {
    static int square_root(int n){
        int i = 1;
        while(i * i <= n){
            if(i * i == n)
                return i;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Using Math.sqrt(): " + Math.sqrt(n));
        System.out.println("Using user-defined method: " + square_root(n));
        sc.close();
    }
}