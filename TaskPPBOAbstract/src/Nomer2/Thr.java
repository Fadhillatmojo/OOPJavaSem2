package Nomer2;

public abstract class Thr {
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // method Thr
    public abstract void thr(Pelajar pelajar);

}
