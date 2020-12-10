package by.academy.lesson6.cat;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    public String makeVoice(){
        return "ГАВ";
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + "}";
    }
}
