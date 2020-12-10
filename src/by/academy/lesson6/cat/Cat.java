package by.academy.lesson6.cat;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    public String makeVoice(){
        return "МЯУ";
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString() + "}";
    }
}
