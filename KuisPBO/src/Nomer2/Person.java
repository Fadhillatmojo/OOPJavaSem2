package Nomer2;

public class Person {
    private String name;
    private String address;

    // konstruktor

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // getter dan setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    // tostring

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
