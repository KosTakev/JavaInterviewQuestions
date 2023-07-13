public class Main {
    public static void main(String[] args) {

        MyClass thread1 = new MyClass();
        thread1.start();

        Thread thread2 = new Thread(new MyNewClass());
        thread2.start();
         /*
        When the thread is started it will call the run()
        method of the MyClass instance instead of executing its own run() method.
         */
    }
}