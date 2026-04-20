package Lab_06;
class Parent {

    // Private variable (cannot be accessed in subclass)
    private int x = 10;

    // Public method to access private variable
    public void showX() {
        System.out.println("Value of x: " + x);
    }
}

// Child class (inherits Parent)
class Child extends Parent {

    public void display() {

        // This will give error if uncommented
        // System.out.println(x);

        System.out.println("Cannot access private variable x directly");

        // Access through public method of parent
        showX();
    }
}

// Main class
public class TestPrivate {
    public static void main(String[] args) {

        Child obj = new Child();

        // Calling child method
        obj.display();
    }
}