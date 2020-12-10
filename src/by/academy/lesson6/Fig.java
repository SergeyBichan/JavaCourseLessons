package by.academy.lesson6;

public class Fig {
    private float x;
    private float y;

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    void move(float dx, float dy){
        x += dx;
        y += dy;
    }

}
