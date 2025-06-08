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

    //to String Methode an jeweilige Aufg angepasst; Aufg 1 und Aufg 3 -> evtl. muss angepasst werden
    @Override
    public String toString() {
        return "Rectangle: width=" +width + ", length=" +length;
    }
}
