package Lab_10;
class Parent {

    protected Number show(int a) {
        System.out.println("Parent Method");
        return a;
    }
}

class Child extends Parent {

    // Increased visibility: protected -> public
    // Covariant return type: Integer is subclass of Number
    public Integer show(int a) {

        System.out.println("Child Method");

        return a;
    }
}

public class Q6 {

    public static void main(String[] args) {

        Child c = new Child();

        System.out.println(c.show(100));
    }
}