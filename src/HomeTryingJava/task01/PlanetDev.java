package HomeTryingJava.task01;

import java.util.Scanner;

public class PlanetDev {

    String name;
    int speed;
    float height;
    boolean atmosphere;

    public PlanetDev() {
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

    public boolean isAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(boolean atmosphere) {
        this.atmosphere = atmosphere;
    }

    @Override
    public String toString() {
        return "МетодИниализатор: " +
                "Имя планеты = " + name + '\'' +
                ", Скорость = " + speed +
                ", Толщина = " + height +
                ", Атмосфера = " + atmosphere;
    }

    public void invalidatorPlanets() {
        Scanner in = new Scanner(System.in);
        System.out.println("Do  you want invalidatorPlanet? (y/n) ?");
        switch (in.nextLine()) {
            case "y":
                System.out.println("Enter name planet: ");
                setName(in.nextLine());
                System.out.println("Enter speed: ");
                setSpeed(in.nextInt());
                System.out.println("Enter height: ");
                setHeight(in.nextInt());
                System.out.println("planet added! Thank you.");
                System.out.println(toString());

                break;
            case "n":
                System.out.println("Good bye!");
                break;
            default:
                System.out.println("Incorrect input please choose (y/n)");
                //вызываем сканер ещё раз сначала метода
                invalidatorPlanets();
        }
    }
}

