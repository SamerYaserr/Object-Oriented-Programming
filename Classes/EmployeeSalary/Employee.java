import java.util.Scanner;
public class Employee {

    private String name;
    private String address;
    private String department;
    private String email;
    private float salary;

    public Employee() {

        Scanner in = new Scanner( System.in );

        System.out.println("Please enter your data:");

        System.out.println("name:");
        name = in.next();

        System.out.println("address:");
        address = in.next();

        System.out.println("department:");
        department = in.next();


        System.out.println("email:");
        email = in.next();

        System.out.println("salary:");
        salary = in.nextFloat();

    }

    public Employee(String name, String address, String department, String email, float salary) {

        this.name = name;
        this.address = address;
        this.department = department;
        this.email = email;
        this.salary = salary;

    }

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

}
