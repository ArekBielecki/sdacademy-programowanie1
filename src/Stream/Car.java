package Stream;

import java.awt.*;

public class Car {
    private String make;
    private String model;
    private String color;
    private int velocity;

    public Car(String make, String model, String color, int velocity) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.velocity = velocity;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getVelocity() {
        return velocity;
    }

    @Override
    public String toString() {
        return "[" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ']';
    }
}
