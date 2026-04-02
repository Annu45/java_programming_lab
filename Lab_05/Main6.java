package Lab_05;
class Printer {
    private static Printer obj1 = new Printer();
    private static Printer obj2 = new Printer();
    private static int count = 0;

    private Printer() {
    }

    public static Printer getInstance() {
        if (count == 0) {
            count++;
            return obj1;
        } else if (count == 1) {
            count++;
            return obj2;
        } else {
            return null;
        }
    }
}

public class Main6 {
    public static void main(String[] args) {
        Printer p1 = Printer.getInstance();
        Printer p2 = Printer.getInstance();
        Printer p3 = Printer.getInstance();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}