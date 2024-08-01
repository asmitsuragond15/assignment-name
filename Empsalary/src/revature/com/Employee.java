package revature.com;

abstract class Employee implements EmpBenefits {
    private int empid;
    private String empname;

    public Employee(int empid, String empname) {
        this.empid = empid;
        this.empname = empname;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee ID: " + empid + ", Employee Name: " + empname;
    }
}
