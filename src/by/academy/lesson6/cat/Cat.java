package by.academy.lesson6.cat;

public class Cat extends AbstractAnimal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    public String makeVoice(){
        return "МЯУ";
    }

    @Override
    public void go() {
        System.out.println("Go cat");
    }

    public String getMur(){
        return "Мурр - мур";
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString() + "}";
    }
}
