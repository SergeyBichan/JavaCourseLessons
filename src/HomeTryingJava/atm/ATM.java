package HomeTryingJava.atm;

public class ATM {
    String name;
    int cashInside;
    int cash20;
    int cash50;
    int cash100;

    public int getCashInside() {
        return cashInside;
    }

    public void setCashInside(int cashInside) {
        this.cashInside = cashInside;
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
}
