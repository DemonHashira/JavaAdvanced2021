package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int n = 9;
        List<Integer> listOfNumbers = new ArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        ClassImplementsRunnable classImplementsRunnable1 = new ClassImplementsRunnable(1,n/2,listOfNumbers);
        ClassImplementsRunnable classImplementsRunnable2 = new ClassImplementsRunnable((n/2+1),n,listOfNumbers);

        Future<Integer> feature1 = executor.submit(classImplementsRunnable1);
        Future<Integer> feature2 = executor.submit(classImplementsRunnable2);

        Integer integer1 = feature1.get();
        Integer integer2 = feature2.get();

        System.out.println(integer1 + integer2);
        System.out.println(listOfNumbers);
        executor.shutdown();
    }
}
