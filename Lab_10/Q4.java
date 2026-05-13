package Lab_10;
class Animal {

    Animal getObject() {
        System.out.println("Animal Object");
        return this;
    }
}

class Dog extends Animal {

    Dog getObject() {
        System.out.println("Dog Object");
        return this;
    }
}

public class Q4 {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.getObject();
    }
}