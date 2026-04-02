//1. Write a Java Program to demonstrate all the three types (Single, Hierarchical, & Multilevel) Inheritance.
package Lab_05;
class A {
    void showA() {
        System.out.println("Class A");
    }
}

class B extends A { // single 
    void showB() {
        System.out.println("Class B");
    }
}

class C extends B { // multilevel 
    void showC() {
        System.out.println("Class C");
    }
}

class D extends A { // hierarchical 
    void showD() {
        System.out.println("Class D");
    }
}

public class Main1 {
    public static void main(String[] args) {
        B b = new B();
        b.showA();
        b.showB();

        C c = new C();
        c.showA();
        c.showB();
        c.showC();

        D d = new D();
        d.showA();
        d.showD();
    }
}