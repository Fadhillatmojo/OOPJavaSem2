package Nomer1;

public class Tabung extends Prisma{
    private double jari;

    // getter and setter


    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    //method-method

    public double getKeliling(){
        double kelilingLingkaran = Math.PI * 2 * jari;
        return kelilingLingkaran;
    }
    public double getLuasAlas() {
        double luasLingkaran = Math.PI * jari * jari;
        return luasLingkaran;
    }

    public double getVolume() {
        double volume = this.getLuasAlas() * super.getTinggi();
        return volume;
    }

    public double getLuasPermukaan() {
        double luasPermukaan = this.getLuasAlas() * 2 + this.getKeliling() * super.getTinggi();
        return luasPermukaan;
    }
}
