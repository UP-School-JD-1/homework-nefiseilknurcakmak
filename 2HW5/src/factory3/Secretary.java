package factory3;

public class Secretary extends Employee {

	protected Manager managerServed;
	
	public Secretary(int no, String name, int year, String department, Manager managerServed) {
		super(no, name, year, department);
	}
	
	public void serve(){
		System.out.println("Secretary " + name + " serves her manager: " + managerServed);
	}

	@Override
	public void work() {
		System.out.println("Secretary is working!");
		serve();
	}

	@Override
	public String toString() {
		return "Secretary [no=" + no + ", managerServed=" + managerServed + ", name=" + name + ", year=" + year
				+ ", department=" + department + "]";
	}
}