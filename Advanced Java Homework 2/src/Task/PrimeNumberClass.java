package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class PrimeNumberClass implements Callable<Object> {

    private int n;
    List<Integer> list = new ArrayList<>();

    public PrimeNumberClass(int n) {
        this.n = n;
    }

    @Override
    public ArrayList call() throws Exception {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        return (java.util.ArrayList) list;
    }


    boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
