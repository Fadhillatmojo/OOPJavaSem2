package Nomer3;

public abstract class Pegawai {
    private int umur, lamaBekerja;
    private String nama;
    // getter and setter

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getLamaBekerja() {
        return lamaBekerja;
    }

    public void setLamaBekerja(int lamaBekerja) {
        this.lamaBekerja = lamaBekerja;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // abstract method thr
    public abstract String thr();


}
