import java.util.Date;

public class PhdStudent extends GraduateStudent {

	boolean  qualifyingExamTaken;
	
	public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis,boolean  qualifyingExamTaken) {
		super(no, name, year, major, dob, advisor, thesis);
		this.qualifyingExamTaken=qualifyingExamTaken;
		
		
	}
	

	@Override
	public void study() {
	
		System.out.println(getName() +  " who PHD student is studying in department of " + major );
	}
	@Override
	public void register() {
	
		System.out.println(getName() +  " who PHD student has registered." );
	
	}
	

	@Override
	public void writeThesis () {
		
		System.out.println(  getName() + " who PHD student is writing thesis  about " + getThesis());
		}

	@Override
	public void meetWithAdvisor() {
		
		System.out.println( getName() + " who PHD student meets once in a week with advisor who is  " + getAdvisor());
	}

		public void writePaper() {
	        System.out.println( getName() + " who PHD student is writing paper.");
	}

	public boolean isQualifyingExamTaken() {
		return qualifyingExamTaken;
	}

	public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
		this.qualifyingExamTaken = qualifyingExamTaken;
		

	}
	

}
