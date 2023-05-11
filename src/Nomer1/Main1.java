package Nomer1;
import java.util.ArrayList;
public class Main1 {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();
        ArrayList<String> matkul = new ArrayList<String>();
        matkul.add("PBO");
        matkul.add("AASD");
        dosen1.setNama("Margareta");
        dosen1.setEdom(3.6);
        dosen1.setJabatanStruktural("Ketua");
        dosen1.setMataKuliah(matkul);
        dosen1.setTotalCuti(12);
        System.out.println("Pelatihan: " + dosen1.bolehIkutPelatihan());
        System.out.println(dosen1.bolehDaftarBeasiswa());
        System.out.println(dosen1.nominalBeasiswa());
        System.out.println(dosen1.getTotalCuti());

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setIpk(4.0);
        mhs1.setNama("Fadhil");
        mhs1.setSemester(6);
        mhs1.setIzin(3);
        System.out.println("Pelatihan: " + mhs1.bolehIkutPelatihan());
        System.out.println(mhs1.bolehDaftarBeasiswa());
        System.out.println(mhs1.nominalBeasiswa());
        System.out.println(mhs1.getIzin());
    }
}
