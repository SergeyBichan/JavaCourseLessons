package by.academy.lesson6;

public class Lamp {
    private boolean isOn;
    public void on() {
        isOn = true;
    }
    public void off() {
        isOn = false;
    }
    public boolean getState() {
        return isOn;
    }
}
