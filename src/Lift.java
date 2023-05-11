public class Lift implements Ispace {
    private int maxCapacity;
    private boolean isGoingUp;
    private boolean isGoingDown;
    private int currentPerson;

    public int getMaxCapacity() {
        return maxCapacity;
    }

    //getter and setter
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean isGoingUp() {
        return isGoingUp;
    }

    public void setGoingUp(boolean goingUp) {
        isGoingUp = goingUp;
    }

    public boolean isGoingDown() {
        return isGoingDown;
    }

    public void setGoingDown(boolean goingDown) {
        isGoingDown = goingDown;
    }

    public int getCurrentPerson() {
        return currentPerson;
    }

    public void setCurrentPerson(int currentPerson) {
        this.currentPerson = currentPerson;
    }

    public void addPerson(){
        currentPerson++;
    }

    // implements ispace


    @Override
    public int leftSpace() {
        return (maxCapacity - currentPerson);
    }

    @Override
    public boolean canFit(int person) {
        return (person <= (maxCapacity - currentPerson));
    }

    @Override
    public boolean doorCanBeOpened() {
        return (!isGoingDown && !isGoingUp);
    }
}
