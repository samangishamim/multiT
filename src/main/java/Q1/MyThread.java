package Q1;

import java.util.List;

public class MyThread implements Runnable {
    private final List<Integer> sharedList;
    private final boolean isEven;
    private final int maxNumber;

    public MyThread(List<Integer> sharedList, boolean isEven, int maxNumber) {
        this.sharedList = sharedList;
        this.isEven = isEven;
        this.maxNumber = maxNumber;
    }

    @Override
    public void run() {
        synchronized (sharedList) {
            for (int i = isEven ? 0 : 1; i <= maxNumber; i += 2) {
                if ((isEven && i % 2 == 0) || (!isEven && i % 2 == 1)) {
                    sharedList.add(i);
                }
            }
            sharedList.notify();
        }
    }
}
