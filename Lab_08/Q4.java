package Lab_08;

public class Q4 {
    public static void main(String[] args) {
        String str = "hello";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) count++;
            }

            if (str.indexOf(ch) == i)
                System.out.println(ch + " : " + count);
        }
    }
}