package HomeTryingJava.atm;

import java.util.Scanner;

public class ATM {
    String name;
    int cash20;
    int cash50;
    int cash100;
    int balance;

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

    public int getBalance(){
        return ((getCash20()*20) + (getCash50()*50) + (getCash100()*100));
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public String operationResult(){
        if (getBalance() > 0){
            return "Operation successful!";
        }
        else {
            return "Try another way bro";
        }
    }

    public void atmWorkingMethod() {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello user!What do you want?");
        System.out.println("1. I want to deposit money: ");
        System.out.println("2. I want to take money: ");
        System.out.println("3. I want to see balance: ");
        switch (in.nextInt()) {
            case 1:
                System.out.println("How much bills by 20$ you want to add?");
                setCash20(in.nextInt());
                System.out.println("How much bills by 50$ you want to add?");
                setCash50(in.nextInt());
                System.out.println("How much bills by 100$ you want to add?");
                setCash100(in.nextInt());
                System.out.println(operationResult());
                System.out.println(getBalance());


        }
    }


}


