package Q2;

public class Util {
    static void sleep(long millis){
        try {
            Thread.sleep(millis);
        }catch (InterruptedException e){
        e.printStackTrace();
        }
    }
}
