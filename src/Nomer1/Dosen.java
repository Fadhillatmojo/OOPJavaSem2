package Nomer1;
import java.util.ArrayList;

public class Dosen extends Pegawai implements Pelatihan, Beasiswa{
    private double edom;
    private String jabatanStruktural;
    private int jmlBimbinganDPA;
    private ArrayList<String> mataKuliah = new ArrayList<String>();

    // getter and setter
    public double getEdom() {
        return edom;
    }

    public void setEdom(double edom) {
        this.edom = edom;
    }

    public String getJabatanStruktural() {
        return jabatanStruktural;
    }

    public void setJabatanStruktural(String jabatanStruktural) {
        this.jabatanStruktural = jabatanStruktural;
    }

    public int getJmlBimbinganDPA() {
        return jmlBimbinganDPA;
    }

    public void setJmlBimbinganDPA(int jmlBimbinganDPA) {
        this.jmlBimbinganDPA = jmlBimbinganDPA;
    }

    public ArrayList<String> getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(ArrayList<String> mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    // implements pelatihan

    @Override
    public boolean bolehIkutPelatihan() {
        return (!jabatanStruktural.isEmpty());
    }

    @Override
    public void orientasi(String hari) {
        if (hari.toLowerCase().equals("sabtu") || hari.toLowerCase().equals("minggu")) {
            super.addCuti();
        }
    }

    // implements beasiswa

    @Override
    public boolean bolehDaftarBeasiswa() {
        return (edom > 3.5);
    }

    @Override
    public int nominalBeasiswa() {
        if (bolehDaftarBeasiswa()) {
            return mataKuliah.size() * 1000000;
        } else {
            return 0;
        }
    }
}
