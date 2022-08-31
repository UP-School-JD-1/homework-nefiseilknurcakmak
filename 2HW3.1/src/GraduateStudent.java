import java.util.Date;

public class GraduateStudent extends AbstractStudents {
	
	String advisor;
	String thesis;

	public GraduateStudent(int no, String name, int year, String major, Date dob, String advisor, String thesis) {
		super();
		this.advisor=advisor;
		this.thesis=thesis;
	}

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}
	
	public String getThesis() {
		return thesis;
	}

	public void setThesis(String thesis) {
		this.thesis = thesis;
	}

	

	@Override
	public void study() {
	
		System.out.println(getName() +  " who graduted student is studying in department of " + major );
	}
	@Override
	public void register() {
	
		System.out.println(getName() +  " who graduted student is registered." );
	
	}
	
    public void meetWithAdvisor() {
        System.out.println( getName() + " that graduate student meets once in a week with advisor who is  " + getAdvisor() );
    }	
    
	public void writeThesis() {
        System.out.println(  getName() + " that graduate student is writing thesis  about " + getThesis() );
    }




}
