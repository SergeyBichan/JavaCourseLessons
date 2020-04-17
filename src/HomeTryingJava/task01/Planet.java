package HomeTryingJava.task01;

import java.util.Scanner;

public class Planet {
    String name;
    int speed;
    float height;
    boolean atmosphere;

    public static int methInputInt(){
        Scanner startScan = new Scanner(System.in);
        int choice = startScan.nextInt();
        return choice;
    }

    public static float methInputFloat(){
        Scanner startScan = new Scanner(System.in);
        float choice = startScan.nextFloat();
        return choice;
    }

    public static String methInputString(){
        Scanner startScan = new Scanner(System.in);
        String choice = startScan.nextLine();
        return choice;
    }

    public boolean getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(boolean atmosphere) {
        this.atmosphere = atmosphere;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

}
