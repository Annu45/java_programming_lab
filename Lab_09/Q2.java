package Lab_09;
public class Q2 {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;

            int arr[] = new int[5];
            arr[10] = 50;

            String s = null;
            System.out.println(s.length());

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurred");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception Occurred");

        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception Occurred");

        } finally {
            System.out.println("Program Finished");
        }
    }
}