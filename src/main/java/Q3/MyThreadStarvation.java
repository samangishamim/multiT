package Q3;

public class MyThreadStarvation {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                while (true) {
                    System.out.println("Thread 1 is running");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                while (true) {
                    System.out.println("Thread 2 is running");
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
