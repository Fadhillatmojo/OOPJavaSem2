package Nomer1;

public class Main {
    public static void main(String[] args) {
        SamaKaki smk1 = new SamaKaki(6, 4);
        SamaKaki smk2 = new SamaKaki(3, 8);
        Siku siku1 = new Siku(4, 3);
        Siku siku2 = new Siku(6, 8);
        System.out.println(siku1.toString());
        System.out.println(siku2.toString());
        System.out.println(smk1.toString());
        System.out.println(smk2.toString());
    }
}