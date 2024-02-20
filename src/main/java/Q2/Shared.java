package Q2;

public class Shared {
    synchronized void test1(Shared s2){
        System.out.println("test 1 is begin  ");
        Util.sleep(1000);

        s2.test2();
        System.out.println("test 1 is enddddd");
    }

    synchronized  void test2(){
        System.out.println("test 2 is begin ");
        Util.sleep(1000);
        System.out.println("test 2 is enddddd");
    }
}
