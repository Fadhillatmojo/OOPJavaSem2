package Nomer3;

public class Circle extends Shape{
    private double radius;

    // konstruktor
    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    // getter dan setter

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // method method
    public double getArea(){
        return radius * radius * 3.14;
    }

    public double getPerimeter(){
        return 2 * radius * 3.14;
    }

    // to string

    @Override
    public String toString() {
        return " Circle dengan radius = " + this.radius + " serta area = " + this.getArea() + " , merupakan subclass dari " + super.toString();
    }
}
