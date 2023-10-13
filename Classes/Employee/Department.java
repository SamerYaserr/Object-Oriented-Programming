public class Department {

    private int deptNo;
    private String deptName;

    public Department() {
        System.out.println("No department data.");
    }

    public Department(int deptNo, String deptName) {

        this.deptNo = deptNo;
        this.deptName = deptName;

    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String toString() {
        return "Department{" +
                "deptNo=" + deptNo +
                ", deptName='" + deptName + '\'' +
                '}';
    }


}
