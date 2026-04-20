package Lab_06;
// Parent class
class Parent {

    // Default constructor
    Parent() {
        System.out.println("Parent Default Constructor");
    }

    // Parameterized constructor
    Parent(int x) {
        System.out.println("Parent Parameterized Constructor: " + x);
    }
}
class Child extends Parent {

    // Default constructor
    Child() {
        // Calling parent default constructor
        super();  
        System.out.println("Child Default Constructor");
    }

    // Parameterized constructor
    Child(int x) {
        // Calling parent parameterized constructor
        super(x);  
        System.out.println("Child Parameterized Constructor: " + x);
    }
}
public class TestConstructor {
    public static void main(String[] args) {

        // Creating object using default constructor
        Child obj1 = new Child();

        System.out.println("------------------");

        // Creating object using parameterized constructor
        Child obj2 = new Child(10);
    }
}