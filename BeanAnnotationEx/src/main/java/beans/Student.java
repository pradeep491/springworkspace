package beans;

public class Student {
    private Address address;

    public Student(Address addrs) {
        this.address = addrs;
    }

    public void print() {
        System.out.println("student class method called...!");
        address.print();
    }
}
