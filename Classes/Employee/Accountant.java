import java.util.Scanner;

public class Accountant extends Employee{

    private String dailyInventory;

    public Accountant() {

        super();

        Scanner in = new Scanner( System.in );

        System.out.println("dailyInventory:");
        dailyInventory = in.next();

    }

    public Accountant(String name, String emailAddress, String phone, String department, String address, int yearOfBirth, float salary, String dailyInventory) {

        super(name, emailAddress, phone, department, address, yearOfBirth, salary);
        this.dailyInventory = dailyInventory;

    }

    public String getDailyInventory() {
        return dailyInventory;
    }

    public void setDailyInventory(String dailyInventory) {
        this.dailyInventory = dailyInventory;
    }

    public String toString() {
        return "Accountant{" +
                "name='" + getName() + '\'' +
                ", emailAddress='" + getEmailAddress() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", yearOfBirth=" + getYearOfBirth() +
                ", salary=" + getSalary() +
                ", dailyInventory='" + dailyInventory + '\'' +
                '}';
    }

}