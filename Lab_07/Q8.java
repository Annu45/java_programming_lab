package Lab_07;
interface Vehicle {
    void start();
}

abstract class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts");
    }

    abstract void stop();
}

class BMW extends Car {
    void stop() {
        System.out.println("BMW stops");
    }
}

public class Q8 {
    public static void main(String[] args) {
        BMW b = new BMW();
        b.start();
        b.stop();
    }
}
