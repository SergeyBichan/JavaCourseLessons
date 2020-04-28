package HomeTryingJava.task01.newTryPlanet;

import java.util.Scanner;

public class NewPlanetScan {
    String name;
    int speed;
    float height;
    String type;
    int sputnikNums;


    public NewPlanetScan() {
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

    public int getSputnikNums() {
        return sputnikNums;
    }

    public void setSputnikNums(int sputnikNums) {
        this.sputnikNums = sputnikNums;
    }
    //    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }

    public String atmosphereChecker(){
        if(sputnikNums < 1){
            return "Спутник";
        }
        else {
            return "Планета";
        }
    }



    @Override
    public String toString() {
        return "МетодИниализатор: " +
                "Имя планеты = " + name + '\'' +
                ", Скорость = " + speed +
                ", Вес = " + height +
                ", Тип обьекта = " + atmosphereChecker();
    }

    public void planetCheckerMethod(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Do you want to create new space object? (y/n)");
        switch (inp.nextLine()){
            case "y":
                System.out.println("Enter name: ");
                setName(inp.nextLine());
                System.out.println("Enter speed: ");
                setSpeed(inp.nextInt());
                System.out.println("Enter height: ");
                setHeight(inp.nextFloat());
                System.out.println("Enter number of sputniks: ");
                setSputnikNums(inp.nextInt());
                System.out.println("Object added!");
                System.out.println(toString());

                break;
            case "n":
                System.out.printf("dosviduli");
                break;
            default:
                System.out.println("Incorrect input, try one more time.");
                planetCheckerMethod();
        }
    }
}