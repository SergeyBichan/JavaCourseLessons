package HomeTryingJava.atm;

import java.util.Scanner;

public class PriorBankATM {
    public static void main(String[] args) {


        ATM priorATM = new ATM();
        priorATM.setName("Priorbank ATM");
        priorATM.setCash20(10);
        priorATM.setCash50(10);
        priorATM.setCash100(3);

        System.out.println("Welcome to visit " + priorATM.getName());

        System.out.println("Money inside ATM: " + MethodsForMoney.moneyInsideATM(priorATM.getCash20(),
                priorATM.getCash50(), priorATM.getCash100()));

        System.out.println("Do u want to put some money for deposit?");

        Scanner choice = new Scanner(System.in);
        int ch = choice.nextInt();


    }
}
