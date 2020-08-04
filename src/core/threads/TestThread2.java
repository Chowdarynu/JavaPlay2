package core.threads;

class Thread2 extends Thread {
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }
    }
}
public class TestThread2{

    public static void main(String[] args) {
        Thread t1 = new Thread2();
        Thread t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
