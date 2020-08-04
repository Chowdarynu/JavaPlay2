package core.threads;

public class T1 extends Thread {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        T1 t1 = new T1();
        t1.start();
    }
}  