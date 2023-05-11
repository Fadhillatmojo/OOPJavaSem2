package Nomer1;

public class PrismaSegitiga extends Prisma{
    private double alasSegitiga, tinggiSegitiga;

    //getter and setter


    public double getAlasSegitiga() {
        return alasSegitiga;
    }

    public void setAlasSegitiga(double alasSegitiga) {
        this.alasSegitiga = alasSegitiga;
    }

    public double getTinggiSegitiga() {
        return tinggiSegitiga;
    }

    public void setTinggiSegitiga(double tinggiSegitiga) {
        this.tinggiSegitiga = tinggiSegitiga;
    }

    // method-method

    public double getMiring(){
        double miring = (Math.sqrt(alasSegitiga*alasSegitiga + tinggiSegitiga*tinggiSegitiga));
        return miring;
    }

    public double getLuasAlas() {
        double luasSegitiga = (0.5*alasSegitiga*tinggiSegitiga);
        return luasSegitiga;
    }

    public double getVolume() {
        double volume = this.getLuasAlas() * super.getTinggi();
        return volume;
    }

    public double getLuasPermukaan() {
        double luasPermukaan = this.getLuasAlas() * 2 + this.getMiring() * super.getTinggi() * 3;
        return luasPermukaan;
    }
}
