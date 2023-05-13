package Nomer1;

public class SamaKaki extends Segitiga{
    public SamaKaki(double a, double t) {
        super(a, t);
    }

    // method
    public double getMiring(){
        double miring = Math.sqrt(Math.pow(super.getA()/2, 2) + Math.pow(super.getT(), 2));
        return miring;
    }
    public double getKeliling(){
        return super.getA() + super.getT() + this.getMiring();
    }

    @Override
    public String toString() {
        return "SamaKaki{Alas=" +
                super.getA() + " Tinggi=" + super.getT() + " Keliling=" + this.getKeliling() + " Luas=" + super.getLuas() +
                "}";
    }
}
