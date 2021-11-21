package Task1;

public class Account {

    private String name;
    private int money;

    Account() {};

    Account(String name, int money) {
        if (name != null && !(name.equals(""))) {
            this.name = name;
        }
        if (money > 0) {
            this.money = money;
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    void getMoneyDebit(int moneyToBeTaken) throws ExceptionsClass {
        if (money > 0) {
            this.money -= moneyToBeTaken;
        }
        if (money < 0) {
            throw new ExceptionsClass("The account " + " " + this.name + " doesn't have enough money");
        } else {
            System.out.println("The account" + " " + this.name + " has: " + this.money + " money " + "left");
        }
    }

    void getMoneyCredit(int moneyToBeTaken) throws ExceptionsClass {
        if (money > 0) {
            this.money -= moneyToBeTaken;
        }

        if (money < 0) {
            throw new ExceptionsClass("The account " + " " + this.name + " doesn't have enough money");
        } else {
            System.out.println("The account" + " " + this.name + " has: " + this.money + " money " + "left");
        }
    }
}

