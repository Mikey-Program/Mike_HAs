package src.HA8;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    //to String Methode an jeweilige Aufg angepasst; Aufg 1 und Aufg 3 -> evtl. muss angepasst werden
    @Override
    public String toString() {
        return "Circle: radius=" + radius;
    }
}
