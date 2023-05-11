public class Potion extends Item implements Attack {
    private int duration;
    private int effectPoint;
    private String type;

    // getter and setter


    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getEffectPoint() {
        return effectPoint;
    }

    public void setEffectPoint(int effectPoint) {
        this.effectPoint = effectPoint;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // method use
    public void use(String type){
        this.type = type;
        if (this.type.toLowerCase().equals("attack")) {
            this.attack();
        } else{
            this.heal();
        }
    }

    private void heal(){
        System.out.println("Healed by {" + effectPoint + "}");
    }

    @Override
    public void attack() {
        if (this.type.toLowerCase().equals("attack")) {
            System.out.println("Damage dealt by {" + effectPoint +"}");
        } else {
            System.out.println("Potion ini bukan Potion Attack");
        }
    }

}
