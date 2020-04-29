package HomeTryingJava.atm;


import java.util.Scanner;

public class ATMtrySec {
    int cash20;
    int cash50;
    int cash100;
    int cashAtStart=1000;
    public int balance =getCash20() + getCash50() + getCash100() + getCashAtStart();
    public int wannaCash;


    public ATMtrySec() {
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCash20() {
        return cash20 * 20;
    }

    public void setCash20(int cash20) {
        this.cash20 = cash20;
    }

    public int getCash50() {
        return cash50 * 50;
    }

    public void setCash50(int cash50) {
        this.cash50 = cash50;
    }

    public int getCash100() {
        return cash100 * 100;
    }

    public void setCash100(int cash100) {
        this.cash100 = cash100;
    }

    public int getCashAtStart() {
        return cashAtStart;
    }

    public void setCashAtStart(int cashAtStart) {
        this.cashAtStart = cashAtStart;
    }

    public int addCash(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public int getCash(int a, int b) {
        return balance = a - b;
    }


    public void atmStartScreen() {
        System.out.println("Hello user! We have " + getCashAtStart());

    }

    public void printMenu() {
        System.out.println("1. I want to deposit money: ");
        System.out.println("2. I want to take money: ");
        System.out.println("3. I want to see balance: ");
    }

    public void atmWork() {
        Scanner in = new Scanner(System.in);
        //setCashAtStart(in.nextInt());
        System.out.println("What do u want to do?");
        printMenu();
        switch (in.nextInt()) {
            case 1:
                System.out.println("Deposit 20$");
                setCash20(in.nextInt());
                System.out.println("Deposit 50$");
                setCash50(in.nextInt());
                System.out.println("Deposit 100$");
                setCash100(in.nextInt());
                balance = addCash(getCash20(), getCash50(), getCash100(), getCashAtStart());
                System.out.println("Ur balance is " +
                        addCash(getCash20(),
                                getCash50(),
                                getCash100(),
                                getCashAtStart()));
                atmWork();
                break;
            case 2:
                System.out.println("How much money u want to take?");
                wannaCash = in.nextInt();
                if (getBalance() > wannaCash) {
                    System.out.println("After this operation we have "
                            + getCash(getBalance(), wannaCash));
                    atmWork();
                } else {
                    System.out.println("we dont have money");
                    atmWork();
                }

            case 3:
                System.out.println("Balance is " + balance);
                atmWork();

        }

    }

}
