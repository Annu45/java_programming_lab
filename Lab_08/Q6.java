package Lab_08;

public class Q6 {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "banana";
        String s3 = "apple";

        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s1.compareTo(s3));
    }
}