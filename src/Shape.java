import java.awt.*;

public abstract class Shape {
    private String color;
    private Boolean filled;

    public Shape() {
        setColor("red");
        setFilled(true);
    }

    public Shape(String color, Boolean filled) {
        setColor(color);
        setFilled(filled);
    }


    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract public double getArea();

    abstract public double getPerimeter();

    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}
