package Task2;

import java.util.concurrent.Callable;

public class FactorialCallable implements Callable<String> {

    private int number;

    public FactorialCallable(int number) {
        this.number = number;
    }

    @Override
    public String call() throws Exception {
        int sum = 1;
        for (int i = 1; i <= number; i++) {
            sum = sum * i;
        }
        return "The factorial is " + sum;
    }
}
