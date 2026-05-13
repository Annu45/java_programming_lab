package Lab_09;
class NumberDisplay {
    synchronized void printEven() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }
    }
    synchronized void printOdd() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}
class EvenThread extends Thread {
    NumberDisplay n;
    EvenThread(NumberDisplay n) {
        this.n = n;
    }
    public void run() {
        n.printEven();
    }
}
class OddThread extends Thread {
    NumberDisplay n;
    OddThread(NumberDisplay n) {
        this.n = n;
    }
    public void run() {
        n.printOdd();
    }
}
public class Q7 {
    public static void main(String[] args) {
        NumberDisplay n = new NumberDisplay();
        EvenThread t1 = new EvenThread(n);
        OddThread t2 = new OddThread(n);
        t1.start();
        t2.start();
    }
}