package Nomer3;

public class Person {
    public static int instanceCount = 0;
    public int localCount = 0;
    // constructor
    public Person() {
        instanceCount++;
        this.localCount++;
    }
}
