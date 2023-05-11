package Nomer1;

public class Main1 {
    public static void main(String[] args) {
        // testing prisma segitiga
        PrismaSegitiga prisma1 = new PrismaSegitiga();
        prisma1.setTinggi(15);
        prisma1.setAlasSegitiga(3);
        prisma1.setTinggiSegitiga(4);
        System.out.println(prisma1.deskripsi());

        // testing tabung
        Tabung tabung1 = new Tabung();
        tabung1.setTinggi(15);
        tabung1.setJari(10);
        System.out.println(tabung1.deskripsi());
    }
}