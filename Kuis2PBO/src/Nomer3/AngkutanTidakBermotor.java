package Nomer3;

public class AngkutanTidakBermotor extends AngkutanUmum{
    private String pemilik;
    public AngkutanTidakBermotor(String pemilik, String pengemudi, int jumlahRoda) {
        super(pengemudi, jumlahRoda);
        this.pemilik = pemilik;

    }
}
