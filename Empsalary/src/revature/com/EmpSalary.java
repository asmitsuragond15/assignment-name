package revature.com;

public class EmpSalary {
	
	public static void main(String[] args) 
	{

		    Employee salariedEmp = new SalariedEmp(1, "John Doe", 22);
	        Employee contractualEmp = new ContractualEmp(2, "Jane Smith", 160);

	        System.out.println(salariedEmp);
	        System.out.println("Salaried Employee Salary: " + salariedEmp.calculateSalary());
	        System.out.println("Salaried Employee Benefits: " + salariedEmp.getBenefits());

	        System.out.println(contractualEmp);
	        System.out.println("Contractual Employee Salary: " + contractualEmp.calculateSalary());
	        System.out.println("Contractual Employee Benefits: " + contractualEmp.getBenefits());
	}
	
}
