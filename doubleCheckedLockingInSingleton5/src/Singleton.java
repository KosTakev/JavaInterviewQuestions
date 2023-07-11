public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton(){}

    public static Singleton getInstance() {
        return  INSTANCE;
    }

    public void show() {
        System.out.println("Singleton using static initialization in Java");
    }
}
