package Q3;

public class MyThreadStarvation {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                while (true) {
                    System.out.println("Thread 1 is running");
                    try {
                        Thread.sleep(1000); // Release the lock for 1 second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });



        // Start both threads
        thread1.start();
//        thread2.start();
    }
}
