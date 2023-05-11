public class Sword extends Item implements Attack{
    private int damage;

    // getter and setter
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    // implementasi Attack

    @Override
    public void attack() {
        System.out.println("Damage dealt by {" + damage +"}");
    }
}
