package Nomer3;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager();
        manager1.setNama("Fadhil");
        manager1.setUmur(25);
        manager1.setLamaBekerja(10);
        System.out.println(manager1.thr());

        OB OB1 = new OB();
        OB1.setNama("Rosyan");
        OB1.setUmur(50);
        OB1.setLamaBekerja(20);
        System.out.println(OB1.thr());

        HRD HRD1 = new HRD();
        HRD1.setNama("Tifa");
        HRD1.setUmur(35);
        HRD1.setLamaBekerja(5);
        System.out.println(HRD1.thr());

    }
}
