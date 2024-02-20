package Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EvenOdd evenOdd = new EvenOdd();
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the input: ");
        int input = Integer.parseInt(scanner.nextLine());

        int eBound = (input % 2 == 0) ? input : input - 1;//sanjidane drost va ghalat bodn
        int oBound = (input % 2 == 0) ? input - 1 : input;

        MyThread t1 = new MyThread("Even", evenOdd,eBound);
        t1.thread.start();

        MyThread t2 = new MyThread("odd", evenOdd,oBound);
        t2.thread.start();



        try {
            t1.thread.join();
            t2.thread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        ArrayList<Integer> list = evenOdd.list;
        for (Integer num : list) {
            System.out.print(num+" ");
        }
    }
}
