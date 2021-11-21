package trySth;

public class ImplementsRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().toString() + "New thread");
    }
}
