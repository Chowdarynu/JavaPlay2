package core.threads;

class Thread3 extends Thread {
    public void run(){
        for(int i=0;i<=5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
public class TestThread3{

    public static void main(String[] args) {
        Thread t1 = new Thread3();
        Thread t2 = new Thread3();
        t1.start();
        t2.start();
    }
}
