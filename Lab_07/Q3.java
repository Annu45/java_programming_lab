package Lab_07;

abstract class Person {
    Person() {
        System.out.println("Person constructor called");
    }

    abstract void show();
}

class Student extends Person {
    Student() {
        System.out.println("Student constructor called");
    }

    void show() {
        System.out.println("Student details");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
}
