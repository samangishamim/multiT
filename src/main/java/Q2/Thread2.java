package Q2;

public class Thread2 extends  Thread{
    private  final Shared s1;
    private  final  Shared s2;


    public Thread2(Shared s1, Shared s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public void run() {
        s2.test1(s1);
    }
}
