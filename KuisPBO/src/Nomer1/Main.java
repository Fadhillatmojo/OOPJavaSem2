package Nomer1;

public class Main {
    public static void main(String[] args) {
        // buat circle
        Cylinder tabung1 = new Cylinder();
        Cylinder tabung2 = new Cylinder(10);
        Cylinder tabung3 = new Cylinder(11, 15);

        // menjalankan semua method pada tabung 1
        System.out.println("radius = " + tabung1.getRadius());
        System.out.println("color = " + tabung1.getColor());
        System.out.println("height = " + tabung1.getHeight());
        System.out.println("luas alas= " + tabung1.getArea());
        System.out.println("Volume = " + tabung1.getVolume());
        System.out.println(tabung1.toString());

        System.out.println();
        // menjalankan semua method pada tabung2
        tabung2.setRadius(12);
        System.out.println("radius = " + tabung2.getRadius());
        tabung2.setColor("blue");
        System.out.println("color = " + tabung2.getColor());
        tabung2.setHeight(15);
        System.out.println("height = " + tabung2.getHeight());
        System.out.println("luas alas= " + tabung2.getArea());
        System.out.println("Volume = " + tabung2.getVolume());
        System.out.println(tabung2.toString());

        System.out.println();
        // menjalankan semua method pada tabung3
        tabung3.setRadius(13);
        System.out.println("radius = " + tabung3.getRadius());
        tabung3.setColor("grey");
        System.out.println("color = " + tabung3.getColor());
        tabung3.setHeight(20);
        System.out.println("height = " + tabung3.getHeight());
        System.out.println("luas alas= " + tabung3.getArea());
        System.out.println("Volume = " + tabung3.getVolume());
        System.out.println(tabung3.toString());
    }
}