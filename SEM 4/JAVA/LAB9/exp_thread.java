import java.lang.Runnable;

class TestThread implements Runnable {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("a" + " ");
        }
    }
}

public class exp_thread {
    public static void main(String[] args) {
        TestThread t = new TestThread();
        Thread thread = new Thread(t); 
        thread.start(); 
    }
}
