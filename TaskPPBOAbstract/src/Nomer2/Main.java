package Nomer2;

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        pegawai1.setNama("Fadhil");
        pegawai1.setGaji(5000000);

        Pelajar pelajar1 = new Pelajar();
        pelajar1.setNama("Tifa");
        pelajar1.setUmur(20);

        Pelajar pelajar2 = new Pelajar();
        pelajar2.setNama("Tanto");
        pelajar2.setUmur(25);

        pegawai1.thr(pelajar1);
        System.out.println();
        pegawai1.thr(pelajar1);
        System.out.println();
        pegawai1.thr(pelajar2);
    }
}
