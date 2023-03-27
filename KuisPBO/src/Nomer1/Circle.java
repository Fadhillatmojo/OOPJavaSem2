package Nomer1;

public class Circle {
    private double radius;
    private String color;

    // konstruktor
    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // method method

    // getter dan setter dari radius
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // getter dan setter dari color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // method get area
    public double getArea(){
        return radius * radius * 3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
