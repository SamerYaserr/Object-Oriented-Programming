import java.util.Scanner;

public class DailyEmployee extends Employee{

    private float dailyRate;
    private float workDayPrice;

    public DailyEmployee() {

        super();

        Scanner in = new Scanner(System.in);

        System.out.println("dailyRate=");
        dailyRate = in.nextFloat();

        System.out.println("workDayPrice=");
        workDayPrice = in.nextFloat();

    }

    public DailyEmployee(String name, String address, String department, String email, float salary, float dailyRate, float workDayPrice) {

        super(name, address, department, email, salary);
        this.dailyRate = dailyRate;
        this.workDayPrice = workDayPrice;

    }

    public float getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(float dailyRate) {
        this.dailyRate = dailyRate;
    }

    public float getWorkDayPrice() {
        return workDayPrice;
    }

    public void setWorkDayPrice(float workDayPrice) {
        this.workDayPrice = workDayPrice;
    }

    public float getSalary() {
        return super.getSalary() + ( dailyRate * workDayPrice );
    }

    public String toString() {
        return "DailyEmployee{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", salary=" + getSalary() +
                ", dailyRate=" + dailyRate +
                ", workDayPrice=" + workDayPrice +
                '}';
    }
}
