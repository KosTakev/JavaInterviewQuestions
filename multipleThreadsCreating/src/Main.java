public class Main {
    public static void main(String[] args) {

        // Create two objects to represent two tasks.
        MyThread thread1 = new MyThread("Cut the ticket"); // Passing task
        // as an argument to its constructor.
        MyThread thread2 = new MyThread("Show your seat number");

        // Create two objects of Thread class
        // and pass two objects as parameter to constructor of Thread class.
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();
    }
}