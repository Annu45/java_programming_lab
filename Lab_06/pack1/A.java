package Lab_06.pack1;

public class A {

    public int pub = 10;

    protected int pro = 20;

    int def = 30;          // default

    private int pri = 40;

    public void show() {

        System.out.println("Public: " + pub);

        System.out.println("Protected: " + pro);

        System.out.println("Default: " + def);

        System.out.println("Private: " + pri);

    }

}