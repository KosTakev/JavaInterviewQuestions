// Two threads performing two tasks at a time.
public class MyThread extends Thread {

    // Declare a String variable to represent task.
    String task;

    public MyThread(String task) {
        this.task = task;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(task + " : " + i);
        }
        try {
            Thread.sleep(1000);
            // Pause the thread execution for 1000 milliseconds.
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
    }
}