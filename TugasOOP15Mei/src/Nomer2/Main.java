package Nomer2;

public class Main {
    public static void main(String[] args) {
        // penggunaan method area melalui objek bertipe living room
        LivingRoom ruangTamu = new LivingRoom("Hijau", 4.5, 6);
        System.out.println("Luasnya adalah = " + ruangTamu.getArea() + " meter persegi");
    }
}
