/*
Creating a thread by EXTENDING
 */
public class MyClass extends Thread {
    @Override
    public void run() {
        System.out.println("MyClass is running");
    }

}
