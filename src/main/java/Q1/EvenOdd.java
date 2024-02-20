package Q1;

public class EvenOdd {
    String State;

    synchronized public void Even(boolean running) {
        if (!running) {//stop

            State = "even";
            notify();//harchi wait stop
            return;
        }

        System.out.println("even ");
        State = "even ";
        notify();
        try {
            while (!State.equals("even"))
                wait();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    synchronized public void Odd(boolean running) {
        if (!running) {
            State = "odd";
            notify();
            return;
        }
        System.out.println("odd ");
        State = "odd ";
        notify();
        try {
            while (!State.equals("odd"))
                wait();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
