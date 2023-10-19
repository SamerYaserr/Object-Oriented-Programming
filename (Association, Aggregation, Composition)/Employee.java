public class Employee {

    private int id;
    private static int count;
    private float salary;
    private PersonalInformation personalInfo;
    private Department dept;

    public Employee() {
        System.out.println("No data.");
    }

    public Employee( float salary, String firstName, String middleName, String lastName, String bloodGroup, String accountNumber, String nationality, int yearOfBirth , Department dept) {

        this.id = count++;
        this.salary = salary;
        this.personalInfo = new PersonalInformation( firstName, middleName, lastName, bloodGroup, accountNumber, nationality, yearOfBirth);
        this.dept = dept;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public PersonalInformation getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInformation personalInfo) {
        this.personalInfo = personalInfo;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {

        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", personalInfo=" + personalInfo +
                ", dept=" + dept +
                '}';
    }
}