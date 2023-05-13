package Nomer3;

public class AngkutanUmum {
    private String pengemudi;
    private int jumlahRoda;

    public AngkutanUmum(String pengemudi, int jumlahRoda) {
        this.pengemudi = pengemudi;
        this.jumlahRoda = jumlahRoda;
    }

    // method method
    public String getPengemudi(){
        return pengemudi;
    }
    public int getJumlahRoda(){
        return jumlahRoda;
    }
}
