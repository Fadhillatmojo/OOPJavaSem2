package Nomer3;

public class HRD extends Pegawai{
    @Override
    public String thr() {
        return "Thr yang didapat oleh HRD bernama " + super.getNama() + " = " + (300000 + (Math.floor(super.getLamaBekerja() / 2) * 100000));
    }
}
