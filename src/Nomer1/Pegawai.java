package Nomer1;

public class Pegawai {
    private String nama, nip;
    private int gaji;
    private String departemen;
    private int tahunMengabdi;
    private int totalCuti;

    //getter and setter


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public int getTahunMengabdi() {
        return tahunMengabdi;
    }

    public void setTahunMengabdi(int tahunMengabdi) {
        this.tahunMengabdi = tahunMengabdi;
    }

    public int getTotalCuti() {
        return totalCuti;
    }

    public void setTotalCuti(int totalCuti) {
        this.totalCuti = totalCuti;
    }

    // method addcuti
    public void addCuti(){
        totalCuti++;
    }
}
