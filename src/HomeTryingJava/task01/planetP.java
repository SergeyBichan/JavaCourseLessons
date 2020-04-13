package HomeTryingJava.task01;

public class planetP {
    public static void main(String[] args) {
        Planet earth = new Planet();
        earth.setName("Earth!");
        earth.setSpeed(108000);
        earth.setHeight(5.9864f);
        earth.setAtmosphere(true);
        System.out.println(earth.getName() + " " + earth.getHeight() + " " + earth.getSpeed());

        NotPlanet moon = new NotPlanet();
        moon.setName("Moon");
        moon.setSpeed(3682);
        moon.setHeight(7509.3494f);
        moon.setAtmosphere(false);
        System.out.println(moon.getName() + " " + moon.getHeight() + " " + moon.getSpeed());

        DecidesForTasks.methToDecide(earth.getAtmosphere());
        DecidesForTasks.methToDecide(moon.getAtmosphere());

    }
}
