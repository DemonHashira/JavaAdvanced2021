package Task1;

import java.util.List;
import java.util.concurrent.Callable;

public class ClassImplementsRunnable implements Callable<Integer> {

    private int a;
    private int b;
    private List<Integer> list;

    ClassImplementsRunnable(int a, int b, List<Integer> listofNumbers) {
        this.a = a;
        this.b = b;
        this.list = listofNumbers;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = a ; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
}
