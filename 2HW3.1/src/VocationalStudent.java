import java.util.Date;

public class VocationalStudent extends AbstractStudents {

	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super();

	}

	@Override
	public void study() {
	
		System.out.println(getName() +  " who vocational student is studying in department of " + major );
	}
	@Override
	public void register() {
	
		System.out.println(getName() +  " who vocational student has registered." );
	
	}

	@Override
	public String toString() {
		
		return super.toString();
	}

	

}
