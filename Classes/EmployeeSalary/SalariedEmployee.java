import java.io.File;
import java.util.Scanner;

public class SalariedEmployee extends Employee{

    private float bonus;

    public SalariedEmployee() {

        super();

        Scanner in = new Scanner(System.in);

        System.out.println("bonus=");
        bonus = in.nextFloat();

    }

    public SalariedEmployee(String name, String address, String department, String email, float salary, float bonus) {

        super(name, address, department, email, salary);
        this.bonus = bonus;

    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float getSalary() {
        return super.getSalary() + bonus;
    }

    public String toString() {
        return "SalariedEmployee{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", salary=" + getSalary() +
                ", bonus=" + bonus +
                "} " ;
    }
}
