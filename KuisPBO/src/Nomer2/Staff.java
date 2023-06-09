package Nomer2;

public class Staff extends Person{
    private String school;
    private double pay;

    // konstruktor
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    // getter dan setter

    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    // to string

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + super.getName() + "\'" +
                ", address'" + super.getAddress() + "\'" +
                ", school='" + school + '\'' +
                ", pay=" + pay +
                '}';
    }
}
