public class MyThread extends Thread {
    
    int sum;

    public MyThread(int sum) {
        this.sum = sum;
    }
    
    public void run() {
        for (int i = 0; i < 10; i++) {
            sum = sum + i;
        }
        try {

        }
    }
}
