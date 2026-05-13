package Lab_10;
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }
}

public class Q1 {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Int Addition: " + c.add(10, 20));

        System.out.println("Float Addition: " + c.add(10.5f, 20.5f));

        System.out.println("Double Addition: " + c.add(1.1, 2.2, 3.3));
    }
}