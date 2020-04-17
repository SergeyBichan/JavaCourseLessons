package HomeTryingJava.task01;

import java.util.Scanner;

public class planetP {
    public static void main(String[] args) {


        Planet earth = new Planet();
        System.out.println("Введите название:\n");
        earth.setName(Planet.methInputString());
        System.out.printf("введите скорость:\n");
        earth.setSpeed(Planet.methInputInt());
        System.out.println("Введите вес:\n");
        earth.setHeight(Planet.methInputFloat());
        earth.setAtmosphere(true);
        System.out.println(earth.getName() + " " + earth.getHeight() + " " + earth.getSpeed());

        NotPlanet moon = new NotPlanet();
        System.out.println("Введите название:\n");
        moon.setName(Planet.methInputString());
        System.out.printf("введите скорость:\n");
        moon.setSpeed(Planet.methInputInt());
        System.out.println("Введите вес:\n");
        moon.setHeight(Planet.methInputFloat());
        moon.setAtmosphere(false);
        System.out.println(moon.getName() + " " + moon.getHeight() + " " + moon.getSpeed());

        DecidesForTasks.methToDecide(earth.getAtmosphere());
        DecidesForTasks.methToDecide(moon.getAtmosphere());

    }
}
