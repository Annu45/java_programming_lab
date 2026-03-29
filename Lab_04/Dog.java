package Lab_04;
class Dog {
    String name;
    int age;
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    void setData(String n, int a) {
        name = n;
        age = a;
    }
    Dog(String n, int a) {
        name = n;
        age = a;
    }

    Dog() {}

    public static void main(String[] args) {

        // Reference var
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.age = 3;
        d1.display();

        // Method
        Dog d2 = new Dog();
        d2.setData("Rocky", 4);
        d2.display();

        // Constructor
        Dog d3 = new Dog("Buddy", 5);
        d3.display();
    }
}