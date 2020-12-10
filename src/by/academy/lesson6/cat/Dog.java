package by.academy.lesson6.cat;

public class Dog extends AbstractAnimal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    public String makeVoice(){
        return "ГАВ";
    }

    @Override
    public void go() {
        System.out.println("Go dog");
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + "}";
    }
}
