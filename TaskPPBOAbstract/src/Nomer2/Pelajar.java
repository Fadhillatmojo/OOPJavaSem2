package Nomer2;

public class Pelajar extends Thr{
    private int umur;
    private int jumlahUangThr = 0;

    // getter and setter

    public int getJumlahUangThr() {
        return jumlahUangThr;
    }

    public void setJumlahUangThr(int jumlahUangThr) {
        this.jumlahUangThr += jumlahUangThr;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // override method abstract
    @Override
    public void thr(Pelajar pelajar) {
    }

}
