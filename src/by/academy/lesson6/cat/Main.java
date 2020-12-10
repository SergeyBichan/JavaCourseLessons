package by.academy.lesson6.cat;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        System.out.println(cat.getMur());

        AbstractAnimal animal = getAnimal("c");
        AbstractAnimal animal2 = new Dog();

        Home home = new Home(animal);
        System.out.println(home.getAnimal().makeVoice());


    }

    private static AbstractAnimal getAnimal(String animal){
        if ("c".equals(animal)){
            return new Cat();
        }
        if ("d".equals(animal)){
            return new Dog();
        }
        throw new IllegalArgumentException("Not found animal " + animal);
    }
}
