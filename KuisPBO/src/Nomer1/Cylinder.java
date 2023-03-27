package Nomer1;

public class Cylinder extends Circle{
    private double height;

    // konstruktor
    public Cylinder(){
        this.height = 1.0;
    }
    public Cylinder(double radius){
        super(radius);
        this.height = 1.0;
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    // method getter dan setter dari height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //method get volume
    public double getVolume(){
        return super.getArea() * height;
    }

    //to string

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + super.getRadius() +
                ", color='" + super.getColor() + '\'' +
                ", height=" + height + '}';
    }
}
