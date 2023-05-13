package Nomer1;

public class Segitiga {
    private double a, t;

    public Segitiga(double a, double t) {
        this.a = a;
        this.t = t;
    }

    // getter setter

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    // method method
    public double getLuas(){
        return a * t / 2;
    }

}
