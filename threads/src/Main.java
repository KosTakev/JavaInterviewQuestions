public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyClass());
        thread1.start();

        /*
        When the thread is started it will call the run()
        method of the MyClass instance instead of executing its own run() method.
         */
    }
}