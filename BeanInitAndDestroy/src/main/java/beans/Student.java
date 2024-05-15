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
    public void init(){
        System.out.println("initialization Logic started...!");
    }
    public void destroy(){
        System.out.println("destroy Logic started...!");
    }
}
