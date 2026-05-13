package Lab_09;
class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Priority: " + Thread.currentThread().getPriority());
        System.out.println("State: " + Thread.currentThread().getState());

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
        }
    }
}

public class Q4 {
    public static void main(String[] args) {

        MyThread t1 = new MyThread("Thread-A");
        MyThread t2 = new MyThread("Thread-B");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}