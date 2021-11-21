package Task2;

public class FactorialThread implements Runnable{

    private int number;

    FactorialThread(int number) {
        if (number > 0) {
            this.number = number;
        }
    }

    @Override
    public void run() {
        int sum = 1;
        for (int i = 1; i <= number; i++) {
                sum = sum * i;
        }
        System.out.println("The factorial of " + number + " is " + sum);
    }
}
