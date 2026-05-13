package Lab_09;
import java.io.*;

public class Q3 {

    static void checkFile() throws IOException {
        FileReader file = new FileReader("abc.txt");
        BufferedReader br = new BufferedReader(file);

        System.out.println(br.readLine());

        br.close();
    }

    public static void main(String[] args) {
        try {
            checkFile();
        } catch (IOException e) {
            System.out.println("File Not Found");
        }
    }
}