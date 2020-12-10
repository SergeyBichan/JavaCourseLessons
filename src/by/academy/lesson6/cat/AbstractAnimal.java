package by.academy.lesson6.cat;

public abstract class AbstractAnimal implements Animal {
    private String name;
    private int age;

    public AbstractAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public AbstractAnimal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String makeVoice(){
        return "Иииихааа";
    }

    public abstract void go();

    @Override
    public String toString() {
        return name + ":" + age;
    }
}
