
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // access mahasiswa yang ada di package1
        package1.Mahasiswa revan = new package1.Mahasiswa();
        revan.nama = "Revandra";
        revan.nim = "123/SV";

        // access mahasiswa yang ada di package2
        package2.Mahasiswa mamad = new package2.Mahasiswa();
        mamad.idMhs = 1;

        // access mahasiswa yang ada di package src yang sama dengan Main
        Mahasiswa mhs = new Mahasiswa();
        mhs.id = "Trpl";
        mhs.name = "Mamad Repan";

    }
}