package Lab_06.pack2;

import Lab_06.pack1.A;

public class B extends A {

    public static void main(String[] args) {

        A obj = new A();
        System.out.println(obj.pub); // public

        // System.out.println(obj.pro);  not accessible
        // System.out.println(obj.def);  not accessible
        // System.out.println(obj.pri);  not accessible

        B obj2 = new B();
        System.out.println(obj2.pro); // protected via inheritance
    }
}