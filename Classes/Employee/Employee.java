import java.util.Scanner;

public class Employee {

    private String name;
    private String emailAddress;
    private String phone;
    private String department;
    private String address;
    private int yearOfBirth;
    private float salary;

    public Employee() {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your data:");

        System.out.println("name:");
        name = in.next();

        System.out.println("emailAddress:");
        emailAddress = in.next();

        System.out.println("phone:");
        phone = in.next();

        System.out.println("department:");
        department = in.next();

        System.out.println("address:");
        address = in.next();

        System.out.println("yearOfBirth:");
        yearOfBirth = in.nextInt();

        System.out.println("salary:");
        salary = in.nextFloat();

    }

    public Employee(String name, String emailAddress, String phone, String department, String address, int yearOfBirth, float salary) {

        this.name = name;
        this.emailAddress = emailAddress;
        this.phone = phone;
        this.department = department;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phone='" + phone + '\'' +
                ", department='" + department + '\'' +
                ", address='" + address + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", salary=" + salary +
                '}';
    }

}