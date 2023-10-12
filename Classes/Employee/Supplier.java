import java.util.Scanner;

public class Supplier extends Employee{

    private String city;

    public Supplier() {

        super();

        Scanner in = new Scanner( System.in );

        System.out.println("city:");
        city = in.next();

    }

    public Supplier(String name, String emailAddress, String phone, String department, String address, int yearOfBirth, float salary, String city) {

        super(name, emailAddress, phone, department, address, yearOfBirth, salary);
        this.city = city;

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        return "Supplier{" +
                "name='" + getName() + '\'' +
                ", emailAddress='" + getEmailAddress() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", yearOfBirth=" + getYearOfBirth() +
                ", salary=" + getSalary() +
                ", city='" + city + '\'' +
                '}';
    }

}