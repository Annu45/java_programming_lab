package Lab_08;

public class Q5 {
    public static void main(String[] args) {
        String str = "hello world java";
        String[] words = str.split(" ");
        String result = "";
        for (String word : words) {
            result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }

        System.out.println(result);
    }
}