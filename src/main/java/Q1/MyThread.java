package Q1;

public class MyThread implements Runnable {

    EvenOdd evenOdd;
    Thread thread;
    int input;

    public MyThread(String name, EvenOdd evenOdd, int input) {
        thread = new Thread(this, name);
        this.evenOdd = evenOdd;
        this.input = input;
    }

    @Override
    public void run() {
        if (thread.getName().compareTo("Even") == 0) {
            for (int i = 0 ; i <= input ; i += 2) evenOdd.Even(true,i);
            evenOdd.Even(false,-1);
        } else {
            for (int i = 1 ; i <= input ; i += 2) evenOdd.Odd(true,i);
            {
                evenOdd.Odd(false,-1);
            }
        }
    }
}
