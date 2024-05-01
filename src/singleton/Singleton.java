package singleton;

public class Singleton {

    //Since Constructor is private, we cannot create objects directly from this class anywhere outside of this class.
    // Therefore, we create the object of this class as private.
    // Then, we use Singleton as a parameter in the getSingleton method and return the singleton reference.
    // Since we cannot directly create an object outside this class, we define the object created inside the class and the getSingleton method as static.
    // Afterward, we create a reference from this class in a main method outside this class and call the object created in the Singleton class in the main method with the Singleton.getSingleton expression.
    // In this way, we access the object of a class whose constructor is private.
    private static Singleton singleton;

    private static int sayi =0;


    private Singleton(){
        System.out.println("Hello World");
    }


    public static Singleton getSingleton(){
        if(singleton ==null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton = new Singleton();
                }

            }
        }

        sayi++;
        System.out.println(sayi);
        return singleton;
    }
}

