package Nomer3;

public class Square extends Rectangle{
    // konstruktor
    public Square(){
    }
    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(color, filled, side, side);
    }

    // getter dan setter
    public double getSide(){
        return super.getLength();
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    // kita tidak perlu meng override fungsi get area dan get perimeter dikarenakan
    // rumus luas dan keliling dari square dan rectangle sama saja, yang berbeda hanyalah valuenya.
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    // to string

    @Override
    public String toString() {
        return "Square dengan side = " + super.getWidth() + " serta area = " + super.getArea() + " , merupakan subclass dari " + super.toString();
    }
}
