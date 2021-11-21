package Task1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

    public static void main(String[] args) {

        ExecutorService service = null;
        Runnable task1 = () -> {for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }};
        Runnable task2 = () -> {for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }};

        MyThread thread = new MyThread();
        Thread tread = new Thread(thread);

        service = Executors.newSingleThreadExecutor();
        service.execute(task1);
        service.execute(task2);
        service.shutdown();

    }
}
