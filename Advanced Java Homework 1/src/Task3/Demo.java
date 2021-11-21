package Task3;

public class Demo {
    public static void main(String[] args) {

        Wallet wallet = new Wallet("Gencho",3000);

        Thread thread = new Thread(wallet);
        Thread thread1 = new Thread(wallet);
        Thread thread2 = new Thread(wallet);

        thread.start();
        thread1.start();
        thread2.start();

    }
}
