package Lab_07;

abstract class Shape {

    final void display() {
        System.out.println("This is final method");
    }

    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }

    // Cannot override display()
}

public class Q4 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.display();
        s.draw();
    }
}