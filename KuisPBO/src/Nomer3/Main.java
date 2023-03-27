package Nomer3;

public class Main {
    public static void main(String[] args) {
        Shape bentuk1 = new Shape("orange", true);
        Circle lingkaran = new Circle("coklat", true, 15.3);
        Rectangle persegiPanjang = new Rectangle(4,10);
        Square kotak = new Square(3);
        System.out.println(bentuk1);
        System.out.println(lingkaran);
        System.out.println(persegiPanjang);
        System.out.println(kotak);
    }
}
