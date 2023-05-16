package package1;

public class Dosen extends Teacher{
    public void membimbing(Mahasiswa mhs){
        System.out.println(mhs.nim);
    }
    public void printGaji(){
        System.out.println(this.gaji);
    }
}
