package Lab_10;
class Parent {

    void show(int a) {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {

    // This is NOT overriding, it is overloading
    void show() {
        System.out.println("Child Method");
    }
}

public class Q3 {

    public static void main(String[] args) {

        Child c = new Child();

        c.show();
        c.show(10);
    }
}