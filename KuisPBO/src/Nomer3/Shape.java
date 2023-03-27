package Nomer3;

public class Shape {
    private String color;
    private boolean filled;

    // konstruktor
    public Shape(){
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    // getter dan setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // to string

    @Override
    public String toString() {
        return "Shape berwarna " + this.getColor() + " dan filled =" + this.isFilled();
    }
}
