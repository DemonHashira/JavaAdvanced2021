package trySth;

public class Threads {

    public static void main(String[] args) {
        ImplementsRunnable implementsRunnable = new ImplementsRunnable();
        Thread thread = new Thread(implementsRunnable);
        thread.start();
        System.out.println(Thread.currentThread().toString()+"Main thread");

        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().toString() + i);
        }
    }
}
