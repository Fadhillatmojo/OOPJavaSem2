public class Main {
    public static void main(String[] args) {
        Potion healingSpell = new Potion();
        healingSpell.setDuration(3);
        healingSpell.setEffectPoint(50);
        healingSpell.use("Heal");

        System.out.println();

        Potion attackSpell = new Potion();
        attackSpell.setDuration(2);
        attackSpell.setEffectPoint(30);
        attackSpell.use("Attack");

        System.out.println();


        Sword excalibur = new Sword();
        excalibur.setDamage(80);
        excalibur.attack();

        System.out.println();

        Shield immortalShield = new Shield();
        immortalShield.setDamageBlock(80);
        immortalShield.defense();

    }
}