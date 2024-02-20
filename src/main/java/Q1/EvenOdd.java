package Q1;

import java.util.ArrayList;

public class EvenOdd {
    String State;
    ArrayList<Integer> list = new ArrayList<>();

    synchronized public void Even(boolean running, int i) {
        if (!running) {//stop

            State = "even";
            notify();//harchi wait stop
            return;
        }
        list.add(i);
        State = "even";
        notify();
        try {
            while (!State.equals("odd"))
                wait();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    synchronized public void Odd(boolean running,int i) {
        if (!running) {
            State = "odd";
            notify();
            return;
        }
        list.add(i);
        State = "odd";
        notify();
        try {
            while (!State.equals("even"))
                wait();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
