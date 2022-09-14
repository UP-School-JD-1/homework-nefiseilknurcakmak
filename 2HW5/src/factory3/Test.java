package factory3;


public class Test {

	public static void main(String[] args) {
		HR hr = new HR();
		int n = 10;
		Employee[] employees = new Employee[n];
		for(int i = 0; i < n; i++)
			employees[i] = hr.getAnEmployee();
		
	
		
		for(Employee e : employees) {
			  try {
	                System.out.println(e);
	                System.out.print("Your salary: " + e.calculateSalary() + " ");
	                if (e.calculateSalary() >= 7000) 
	                    throw new SalaryPaidOnBankException("Contact the accounting department for salaries of 7000 and above.(#SalaryPaidOnBankException)");
	                else System.out.println("\nYou can withdraw your salary from the ATM.");
	            } catch (SalaryPaidOnBankException salaryPaidOnBankException) {
	                System.out.println("\n" + salaryPaidOnBankException.getMessage());
	            } finally {
	                System.out.println("_______________Salary information system is closed.___________________");
	            }}}}

