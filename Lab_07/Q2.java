package Lab_07;
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Q2 {
    public static void main(String[] args) {
        // Animal a = new Animal(); //error ayega isse

        Animal a = new Dog(); //ye allow h
        a.sound();
    }
}
