package core.threads;

public class TestThreadTwice1 extends Thread {
    public void run() {
        System.out.println("running...");
    }

    public static void main(String args[]) {
        TestThreadTwice1 t1 = new TestThreadTwice1();
        t1.start();
        t1.start();
    }
}

//can we start threas twice? No, it will throw IllegalThreadStateException