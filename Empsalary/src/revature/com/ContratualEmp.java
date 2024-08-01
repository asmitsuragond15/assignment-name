package revature.com;
class ContractualEmp extends Employee {
    private int workhrs;
    

    public ContractualEmp(int empid, String empname, int workhrs) {
        super(empid, empname);
        this.workhrs = workhrs;
    }

    public int getWorkhrs() {
        return workhrs;
    }

    public void setWorkhrs(int workhrs) {
        this.workhrs = workhrs;
    }


    public double calculateSalary() {
        return workhrs * 200;
    }
    
    public String getBenefits() {
        return "No Benefits for Contratual Employee";
    }
}
