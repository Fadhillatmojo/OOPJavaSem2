package Nomer3;

public class Main {
    public static void main(String[] args) {
        AngkutanUmum[] ang = new AngkutanUmum[4];
        ang[0] = new Andong("Agus");
        ang[1] = new Becak("Joko");
        ang[2] = new Bus();
        ang[3] = new Taksi();
        for (int i = 0; i < ang.length; i++) {
            System.out.print(ang[i].getPengemudi() + "\t");
            System.out.print(ang[i].getJumlahRoda() + "\t");
        }
    }
}
