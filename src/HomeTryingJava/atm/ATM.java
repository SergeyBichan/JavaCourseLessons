package HomeTryingJava.atm;

import java.util.Scanner;

/*public class ATM {
    String name;
    int cash20;
    int cash50;
    int cash100;
    int balance;
    int startCash = 1000;
    int credit;

    public ATM() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCash20() {
        return cash20;
    }

    public void setCash20(int cash20) {
        this.cash20 = cash20;
    }

    public int getCash50() {
        return cash50;
    }

    public void setCash50(int cash50) {
        this.cash50 = cash50;
    }

    public int getCash100() {
        return cash100;
    }

    public void setCash100(int cash100) {
        this.cash100 = cash100;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance + startCash;
    }

    public int takeMoney() {
        return (getBalance() - ((getCash20() * 20) - (getCash50() * 50) - (getCash100() * 100)));
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String operationResult(int a, int b) {
        if (a > b) {
            return "Operation successful!";
        } else {
            return "Try another way bro";
        }
    }

    public void atmStartScreen() {
        System.out.println("Hello user!");
    }

    public void printMenu() {
        System.out.println("Make your choice shammy!");
        System.out.println("1. I want to deposit money: ");
        System.out.println("2. I want to take money: ");
        System.out.println("3. I want to see balance: ");
    }


    public void atmWorkingMethod() {
        Scanner in = new Scanner(System.in);
        setBalance(in.nextInt());
        System.out.println(operationResult(getBalance(), startCash));
        printMenu();

        switch (in.nextInt()) {
            case 1:
                System.out.println("Deposit 20$ to balance");
                setCash20(in.nextInt());
                System.out.println("Deposit 50$ to balance");
                setCash50(in.nextInt());
                System.out.println("Deposit 100$ to balance");
                setCash100(in.nextInt());
                System.out.println("Your balance bro is: " + getBalance());
                System.out.println(operationResult(getBalance(), balance));
                atmWorkingMethod();


//            case 2:
//                System.out.println("How much money u want to take?");
//
//                System.out.println(getBalance());
//                System.out.println(operationResult(getBalance(), takeMoney()));


            case 3:
                System.out.println(getBalance());


        }
    }


}
*/



