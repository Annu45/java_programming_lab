package Lab_08;

public class Q2 {
    public static void main(String[] args) {
        String str = "Hello world Java";
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') count++;
        }

        System.out.println("Words: " + count);
    }
}