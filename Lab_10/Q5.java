package Lab_10;
class Parent {

    private void display() {
        System.out.println("Private Method of Parent");
    }

    void show() {
        display();
    }
}

class Child extends Parent {

    void display() {
        System.out.println("Method of Child");
    }
}

public class Q5 {

    public static void main(String[] args) {

        Child c = new Child();

        c.display();
        c.show();
    }
}