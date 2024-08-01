package revature.com;
class SalariedEmp extends Employee {
    private int workdays;
  
    public SalariedEmp(int empid, String empname, int workdays) {
        super(empid, empname);
        this.workdays = workdays;
    }

    public int getWorkdays() {
        return workdays;
    }

    public void setWorkdays(int workdays) {
        this.workdays = workdays;
    }

    
    public double calculateSalary() {
        return workdays * 2000;
    }
    
    public String getBenefits() {
        return "Health Insurance, Paid Leave, Retirement Benefits";
    }
}
