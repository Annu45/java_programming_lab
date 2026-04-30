package Lab_08;

public class Q7 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        boolean isEqual = true;
        if (s1.length() != s2.length()) {
            isEqual = false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }

        System.out.println("Equal: " + isEqual);
    }
}