package singleton;

public class App {
    public static void main(String[] args) {
        // We can access the object of Singleton class with Singleton.getSingleton expression.

        for (int i = 0; i < 10; i++) {
            Singleton singleton = Singleton.getSingleton();
        }
    }
}
