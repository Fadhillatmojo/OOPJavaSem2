public class Shield extends Item{
    private int damageBlock;

    // getter and setter

    public int getDamageBlock() {
        return damageBlock;
    }

    public void setDamageBlock(int damageBlock) {
        this.damageBlock = damageBlock;
    }

    // method defense
    public void defense(){
        System.out.println("Damage mitigated by {" + damageBlock +"}");
    }
}
