package by.academy.lesson6.cat;

public class Home {

    private AbstractAnimal animal;

    public Home(AbstractAnimal animal) {
        this.animal = animal;
    }

    public AbstractAnimal getAnimal() {
        return animal;
    }
}
