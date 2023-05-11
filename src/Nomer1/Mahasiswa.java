package Nomer1;

public class Mahasiswa implements Pelatihan, Beasiswa{
    private String nama, nim;
    private String kelas;
    private double ipk;
    private String prodi;
    private int semester;
    private int izin;

    // getter and setter


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getIzin() {
        return izin;
    }

    public void setIzin(int izin) {
        this.izin = izin;
    }

    // implements pelatihan

    @Override
    public boolean bolehIkutPelatihan() {
        return (ipk > 3.0 && semester < 8);
    }
    @Override
    public void orientasi(String hari) {
        if (!(hari.toLowerCase().equals("sabtu") || hari.toLowerCase().equals("minggu"))) {
            izin++;
        }
    }

    @Override
    public boolean bolehDaftarBeasiswa() {
        return (ipk >= 3.5 && ipk <= 4.0);
    }

    @Override
    public int nominalBeasiswa() {
        if (bolehDaftarBeasiswa()) {
            if (ipk == 4.0) {
                return 2000000;
            } else {
                return 1000000;
            }
        } else {
            return 0;
        }
    }
}
