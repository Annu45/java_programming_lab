package Lab_06.Testpackage;

// No import statement used here

public class Test3 {
    public static void main(String[] args) {

        // Using fully qualified names (package + class)
        Lab_06.mypack.A obj1 = new Lab_06.mypack.A();
        Lab_06.mypack.B obj2 = new Lab_06.mypack.B();

        // Calling methods
        obj1.showA();
        obj2.showB();
    }
}