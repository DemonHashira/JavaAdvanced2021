package Task3;

import java.util.Random;

public class Wallet extends Thread{

    private String owner;
    private int money;

    Wallet(String owner, int money) {
        if (owner != null && !(owner.equals(""))) {
            this.owner = owner;
        }
        if (money > 0) {
            this.money = money;
        }
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        if (owner != null && !(owner.equals(""))) {
            this.owner = owner;
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money > 0) {
            this.money = money;
        }
    }

   void addMoney(int money) {
        if (money > 0) {
            this.money += money;
        }
   }

   synchronized void removeMoney(int money) {
       if (money > 0 && this.money > 0) {
           this.money -= money;
       }

    if (this.money > 0) {
        System.out.println("The wallet owner " + this.owner +  " has " + this.money + " left ");
    } else {
        try {
            throw new ExceptionMessage("There isn't any money left in this wallet");
        } catch (ExceptionMessage exceptionMessage) {
            exceptionMessage.printStackTrace();
        }
    }

    }

    @Override
    public void run() {
            int moneyToBeTaken = new Random().nextInt(3000);
            removeMoney(moneyToBeTaken);
    }
}
