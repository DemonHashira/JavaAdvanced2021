package Task2;

public class Demo {

    public static void main(String[] args) {

        MyThread thread = new MyThread(20);
        Thread thread1 = new Thread(thread);
        thread1.start();

        FactorialThread factorialThread = new FactorialThread(5);
        Thread thread2 = new Thread(factorialThread);
        thread2.start();
    }
}
