package Task2;

import java.util.concurrent.*;

public class FactorialCallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = null;
        service = Executors.newFixedThreadPool(20);
        FactorialCallable factorialCallable = new FactorialCallable(8);
        Future<String> result = service.submit(factorialCallable);
        try {
            System.out.println(result.get(10,TimeUnit.SECONDS));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }
}