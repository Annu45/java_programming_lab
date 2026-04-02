package Lab_05;
class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Connection created");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}

public class Main5 {
    public static void main(String[] args) {
        DatabaseConnection obj1 = DatabaseConnection.getInstance();
        DatabaseConnection obj2 = DatabaseConnection.getInstance();

        System.out.println(obj1 == obj2); 
    }
}