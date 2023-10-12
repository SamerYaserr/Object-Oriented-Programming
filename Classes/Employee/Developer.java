import javax.xml.namespace.QName;
import java.util.Scanner;

public class Developer extends Employee {

    private String projectName;

    public Developer() {

        super();

        Scanner in = new Scanner( System.in );

        System.out.println("projectName:");
        projectName = in.next();

    }

    public Developer(String name, String emailAddress, String phone, String department, String address, int yearOfBirth, float salary, String projectName) {

        super(name, emailAddress, phone, department, address, yearOfBirth, salary);
        this.projectName = projectName;

    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String toString() {
        return  "Developer{" +
                "name='" + getName() + '\'' +
                ", emailAddress='" + getEmailAddress() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", yearOfBirth=" + getYearOfBirth() +
                ", salary=" + getSalary() +
                ", projectName='" + projectName + '\'' +
                '}';
    }


}