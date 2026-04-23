package Lab_07;

interface Animal {
    void sound();
    void sleep();

    default void eat() {
        System.out.println("Animal eats food");
    }

    static void info() {
        System.out.println("This is Animal interface");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}

public class Q5 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
        c.sleep();
        c.eat();

        Animal.info();
    }
}