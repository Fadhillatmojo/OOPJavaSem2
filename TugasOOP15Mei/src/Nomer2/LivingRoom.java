package Nomer2;

public class LivingRoom extends Room{
    private String warna;
    public LivingRoom(String warna, double lebar, double panjang) {
        super(lebar, panjang);
        this.warna = warna;
    }

    // getter and setter
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
}
