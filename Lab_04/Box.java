/*2. Write a Java program to create a class Box with:
• Instance variables: length, breadth, height
• Constructors:
o Default constructor
o Parameterized constructor
• Method: volume()
Create objects using both constructors and display the volume. */
package Lab_04;
class Box {
    int length, breadth, height;
    Box() {
        length = 1;
        breadth = 1;
        height = 1;
    }
    Box(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    int volume() {
        return length * breadth * height;
    }

    public static void main(String[] args) {
        Box b1 = new Box(); 
        Box b2 = new Box(2, 3, 4);

        System.out.println("Volume (default): " + b1.volume());
        System.out.println("Volume (parameterized): " + b2.volume());
    }
}