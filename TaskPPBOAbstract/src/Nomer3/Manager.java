package Nomer3;

public class Manager extends Pegawai{
    @Override
    public String thr() {
        return "Thr yang didapat oleh Manager bernama "+ super.getNama() + " = " + (Math.ceil(super.getLamaBekerja() / 3) * 300000);
    }
}
