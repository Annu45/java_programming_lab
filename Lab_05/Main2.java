package Lab_05;
class Person {
    private String name; 

    public void setName(String n) { 
        name = n;
    }

    public String getName() { 
        return name;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Annu");
        System.out.println(p.getName());
    }
}