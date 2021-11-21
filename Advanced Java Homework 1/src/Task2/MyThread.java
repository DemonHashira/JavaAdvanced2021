package Task2;

public class MyThread implements Runnable {

    private int number;

    MyThread(int number) {
        if (number > 0) {
            this.number = number;
        }
    }


    @Override
    public void run() {
        long number1 = 1L;
        long number2 = 1L;

        for (int i = 1; i <= number - 2; i++) {
            long sumOfNumbers = number1 + number2;
            number1 = number2;
            number2 = sumOfNumbers;
        }

        System.out.println("Fibonnaci number is " + number2);
    }
}
