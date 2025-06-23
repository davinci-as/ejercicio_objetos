public class Circle extends Shape {
    private double radius;

    public Circle() {
        setRadius(1.0);
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public Circle(double radius, String color, Boolean filled) {
        super(color, filled);
        setRadius(radius);
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (2 * radius);
    }

    @Override
    public String toString() {
        String shareOutput = super.toString();
        return "Circle[" + shareOutput + ", radius=" + radius + "]";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
