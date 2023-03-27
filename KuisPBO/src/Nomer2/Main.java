package Nomer2;


public class Main {
    public static void main(String[] args) {
        // buat objek person
        Person orang1 = new Person("Tanto", "Sendowo");
        System.out.println(orang1.getName());
        System.out.println(orang1.getAddress());
        System.out.println(orang1.toString());
        System.out.println();

        Person orang2 = new Person("Ghifari", "Candi Gebang");
        System.out.println(orang2.getName());
        System.out.println(orang2.getAddress());
        System.out.println(orang2.toString());
        System.out.println();

        Person orang3 = new Person("Askar", "Karanggayam");
        System.out.println(orang3.getName());
        System.out.println(orang3.getAddress());
        System.out.println(orang3.toString());
        System.out.println();

        // buat objek student
        Student siswa1 = new Student("Fadhil", "Bantul", "S1", 2022, 100000);
        System.out.println(siswa1.getName());
        System.out.println(siswa1.getAddress());
        System.out.println(siswa1.getProgram());
        System.out.println(siswa1.getYear());
        System.out.println(siswa1.getFee());
        System.out.println(siswa1.toString());
        System.out.println();

        Student siswa2 = new Student("Shyra", "gejayan", "S1", 2022, 120000);
        System.out.println(siswa2.getName());
        System.out.println(siswa2.getAddress());
        System.out.println(siswa2.getProgram());
        System.out.println(siswa2.getYear());
        System.out.println(siswa2.getFee());
        System.out.println(siswa2.toString());
        System.out.println();

        Student siswa3 = new Student("Caca", "Jl. Wates", "S1", 2022, 134000);
        System.out.println(siswa3.getName());
        System.out.println(siswa3.getAddress());
        System.out.println(siswa3.getProgram());
        System.out.println(siswa3.getYear());
        System.out.println(siswa3.getFee());
        System.out.println(siswa3.toString());
        System.out.println();

        //buat objek staff

        Staff staff1 = new Staff("Verlino", "Jakal", "UGM", 2500000);
        System.out.println(staff1.getName());
        System.out.println(staff1.getAddress());
        System.out.println(staff1.getSchool());
        System.out.println(staff1.getPay());
        System.out.println(staff1.toString());
        System.out.println();

        Staff staff2 = new Staff("Fabih", "Jalan Magelang", "Padmanaba", 4308900);
        System.out.println(staff2.getName());
        System.out.println(staff2.getAddress());
        System.out.println(staff2.getSchool());
        System.out.println(staff2.getPay());
        System.out.println(staff2.toString());
        System.out.println();

        Staff staff3 = new Staff("Tifa", "Bantul", "UGM", 2503400);
        System.out.println(staff3.getName());
        System.out.println(staff3.getAddress());
        System.out.println(staff3.getSchool());
        System.out.println(staff3.getPay());
        System.out.println(staff3.toString());
        System.out.println();
    }

}
