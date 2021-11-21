package Task1;

public class Demo {

    public static void main(String[] args)  {

        Account account1 = new Account("Account 1",10000);
        Account account2 = new Account("Account 2", 1500000000);

        try {
            account1.getMoneyCredit(1500);
        } catch (ExceptionsClass exceptionsClass) {
            exceptionsClass.printStackTrace();
        }
        try {
            account2.getMoneyDebit(123344);
        } catch (ExceptionsClass exceptionsClass) {
            exceptionsClass.printStackTrace();
        }

    }
}
