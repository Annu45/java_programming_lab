package Lab_05;
class Parent {
    protected int value = 100; 
}

class Child extends Parent {
    void display() {
        System.out.println(value); 
    }
}

public class Main3 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}