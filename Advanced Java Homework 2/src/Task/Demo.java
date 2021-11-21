package Task;

import java.util.concurrent.*;

public class Demo {

    public static void main(String[] args) {

        ExecutorService service = null;
        service = Executors.newFixedThreadPool(5);
        PrimeNumberClass primeNumberClass = new PrimeNumberClass(100);
        Future<Object> result = service.submit(primeNumberClass);
        try {
            System.out.println(result.get(10, TimeUnit.MILLISECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }
}
