import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Input:");
        int inputNumber = scanner.nextInt();

        List<Integer> sharedList = new ArrayList<>();
        Runnable evenRunnable = new MyThread(sharedList, true, inputNumber);
        Runnable oddRunnable = new MyThread(sharedList, false, inputNumber);

        Thread evenThread = new Thread(evenRunnable);
        Thread oddThread = new Thread(oddRunnable);

        evenThread.start();
        oddThread.start();

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Even Output:");
        sharedList.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        System.out.println("Odd Output:");
        sharedList.stream()
                .filter(n -> n % 2 != 0)
                .forEach(n -> System.out.print(n + " "));
    }
}
