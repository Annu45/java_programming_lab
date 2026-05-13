package Lab_10;
class Person {
    void displayDetails() {
        System.out.println("Displaying Person Details");
    }
}
class Student extends Person {
    void displayDetails() {
        System.out.println("Displaying Student Details");
    }
}
class Teacher extends Person {
    void displayDetails() {
        System.out.println("Displaying Teacher Details");
    }
}
public class Q2 {
    public static void main(String[] args) {

        Student s = new Student();
        Teacher t = new Teacher();

        s.displayDetails();
        t.displayDetails();
    }
}