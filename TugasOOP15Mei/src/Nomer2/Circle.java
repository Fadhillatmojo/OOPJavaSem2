package Nomer2;

public class Circle {
    private double jari;

    // getter and setter

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    // method getLuas
    public double getLuas(){
        double luas = Mathlib.pi * jari * jari;
        return luas;
    }
}
