import java.util.Scanner;

public class HourlyEmployee extends Employee {

    private float hourlyRate;
    private float workHourPrice;

    public HourlyEmployee() {

        super();

        Scanner in = new Scanner(System.in);

        System.out.println("hourlyRate=");
        hourlyRate = in.nextFloat();

        System.out.println("workHourPrice=");
        workHourPrice = in.nextFloat();

    }

    public HourlyEmployee(String name, String address, String department, String email, float salary, float hourlyRate, float workHourPrice) {

        super(name, address, department, email, salary);
        this.hourlyRate = hourlyRate;
        this.workHourPrice = workHourPrice;

    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public float getWorkHourPrice() {
        return workHourPrice;
    }

    public void setWorkHourPrice(float workHourPrice) {
        this.workHourPrice = workHourPrice;
    }

    public float getSalary() {
        return super.getSalary() + ( hourlyRate * workHourPrice );
    }

    public String toString() {
        return "HourlyEmployee{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", salary=" + getSalary() +
                ", hourlyRate=" + hourlyRate +
                ", workHourPrice=" + workHourPrice +
                '}';
    }

}