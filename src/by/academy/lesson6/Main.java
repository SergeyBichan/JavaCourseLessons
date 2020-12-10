package by.academy.lesson6;


public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Lamp lamp2 = lamp;
        System.out.println(lamp.getState());
        System.out.println(lamp2.getState());
        lamp.on();
        System.out.println(lamp.getState());
        System.out.println(lamp2.getState());



    }
}
