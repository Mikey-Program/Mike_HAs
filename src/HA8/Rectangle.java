package src.HA8;

public class Rectangle extends Shape{

    private int width, length;

    public Rectangle(int width, int length) {
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
