package Nomer1;

public abstract class Prisma {
    private double tinggi;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // abstract method
    public abstract double getVolume();
    public abstract double getLuasPermukaan();
    public abstract double getLuasAlas();

    public String deskripsi(){
        return "Prisma ini memiliki {luas permukaan = " + getLuasPermukaan() + ", Volume sebesar = " + getVolume() + "}";
    }

}
