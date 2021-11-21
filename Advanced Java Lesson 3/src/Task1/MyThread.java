package Task1;

public class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
}
