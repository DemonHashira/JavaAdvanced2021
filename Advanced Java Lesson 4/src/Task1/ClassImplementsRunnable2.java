package Task1;

public class ClassImplementsRunnable2 implements Runnable{

    private int n;

    ClassImplementsRunnable2(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <= n / 2; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
