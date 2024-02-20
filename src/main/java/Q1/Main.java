package Q1;

public class Main {
    public static void main(String[] args) {
        EvenOdd evenOdd=new EvenOdd();
        MyThread t1=new MyThread("Even",evenOdd);
        t1.thread.start();

        MyThread t2=new MyThread("odd",evenOdd);
        t2.thread.start();
    }
}
