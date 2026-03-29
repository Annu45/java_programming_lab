/*8. Write a Java program to create a class Student with:
• Instance variables: name, marks
• Static variable: collegeName
• Methods:
o input()
o display() */
package Lab_04;
import java.util.*;
public class Student {
    String name;
    int marks;
    static String collegeName = "ABC College";

    void input(String n, int m) {
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("College: " + collegeName);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.input("Annu", 90);
        s2.input("Rahul", 85);

        // change static variable
        Student.collegeName = "NIT Srinagar";

        s1.display();
        System.out.println();
        s2.display();
    }
}
