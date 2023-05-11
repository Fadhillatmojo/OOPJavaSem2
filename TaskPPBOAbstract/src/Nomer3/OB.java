package Nomer3;

public class OB extends Pegawai{
    @Override
    public String thr() {
        return "Thr yang didapat oleh OB bernama " + super.getNama() + " = " + (super.getLamaBekerja() * 50000 + 200000);
    }
}
