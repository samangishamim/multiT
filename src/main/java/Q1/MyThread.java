package Q1;
public class MyThread implements Runnable {

    EvenOdd evenOdd;
    Thread thread;
    int input;

    public MyThread(String name, EvenOdd evenOdd) {
        thread = new Thread(this, name);
        this.evenOdd = evenOdd;
    }

    @Override
    public void run() {
        if (thread.getName().compareTo("Even") == 0) {
            for (int i = 0; i <=input; i += 2) evenOdd.Even(true);
            evenOdd.Even(false);
        } else {
            for (int i = 0; i < input; i += 2) evenOdd.Odd(true);
            {
                evenOdd.Odd(false);
            }
        }
    }
}
