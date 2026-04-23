package Lab_07;

interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

class Demo implements B {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() {
        System.out.println("Method B");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.methodA();
        d.methodB();
    }
}