package Lab_06;

// Program to count total number of characters excluding spaces
public class CountChars {
    public static void main(String[] args) {

        // Check if input is given
        if (args.length == 0) {
            System.out.println("Please provide a sentence as command-line input");
            return;
        }

        int count = 0;

        // Loop through all arguments (words)
        for (String word : args) {
            count += word.length();   // count characters in each word
        }

        // Display result
        System.out.println("Total characters (excluding spaces): " + count);
    }
}