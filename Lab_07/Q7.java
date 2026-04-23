package Lab_07;

interface Test {
    void show();
    void display();
}

abstract class Demo implements Test {
    public void show() {
        System.out.println("Show method");
    }
    // display() not implemented--class must be abstract
}

class Demo2 extends Demo {
    public void display() {
        System.out.println("Display method");
    }
}

public class Q7 {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.show();
        d.display();
    }
}