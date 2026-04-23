package Lab_07;
abstract class Vehicle {
    abstract void start();
    abstract void stop();
    void fuelType() {
        System.out.println("Uses fuel");
    }

    void wheels() {
        System.out.println("Has wheels");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }

    void stop() {
        System.out.println("Car stops with brake");
    }
}

class Truck extends Vehicle {
    void start() {
        System.out.println("Truck starts with button");
    }

    void stop() {
        System.out.println("Truck stops slowly");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();
        v1.stop();

        Vehicle v2 = new Truck();
        v2.start();
        v2.stop();
    }
}