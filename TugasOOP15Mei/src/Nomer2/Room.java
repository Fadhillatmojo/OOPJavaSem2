package Nomer2;

public class Room {
    private double lebar;
    private double panjang;

    // constructor

    public Room(double lebar, double panjang) {
        this.lebar = lebar;
        this.panjang = panjang;
    }
    //getter and setter
    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    // method final getArea
    public final double getArea(){
        return panjang * lebar;
    }
}
