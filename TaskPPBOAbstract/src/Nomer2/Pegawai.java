package Nomer2;

public class Pegawai extends Thr{
    private int gaji;

    // getter and setter

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    // method override

    @Override
    public void thr(Pelajar pelajar) {
        int jumlahThr = (pelajar.getUmur() * 10 / 5) * 1000;
        int sisaGaji = gaji - jumlahThr;
        this.gaji = sisaGaji;
        pelajar.setJumlahUangThr(jumlahThr);
        System.out.println("Pegawai '" + super.getNama() + "' memberikan THR kepada pelajar bernama '" + pelajar.getNama()
                            + "' sebanyak Rp " + jumlahThr + ", dengan sisa gaji sebanyak Rp " + sisaGaji);
        System.out.println("Jumlah total Uang THR pelajar bernama '" + pelajar.getNama() + "': Rp " + pelajar.getJumlahUangThr());
    }
}
