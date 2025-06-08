package src.HA8;

public class Rectangle extends Shape{

    private double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public String toString() {
        return "Rectangle (" + getArea()+ ")";
    }
}
