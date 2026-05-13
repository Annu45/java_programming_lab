package Lab_09;
class DemoThread extends Thread {

    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Thread Running");
        } else {
            System.out.println("User Thread Running");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

public class Q5 {
    public static void main(String[] args) {

        DemoThread t1 = new DemoThread();
        DemoThread t2 = new DemoThread();

        t1.setDaemon(true);

        t1.start();
        t2.start();
    }
}