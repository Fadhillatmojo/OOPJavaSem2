package Nomer3;

public class Rectangle extends Shape{
    private double width;
    private double length;

    // konstruktor
    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // getter dan setter

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // method
    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return 2 * width + 2 * length;
    }

    // to string


    @Override
    public String toString() {
        return "Rectangle dengan width=  " + this.width + " dan length = "+ this.length + " serta area = " + this.getArea() +" , merupakan subclass dari " + super.toString();
    }
}
