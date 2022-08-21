
public class PhdStudent extends GraduateStudent {

	boolean  qualifyingExamTaken;
	
	public PhdStudent(int no, String name, int year, String major, String advisor, String thesis,boolean  qualifyingExamTaken) {
		super(no, name, year, major, advisor, thesis);
		this.qualifyingExamTaken=qualifyingExamTaken;
		
		
	}
	

	@Override
	public void study() {
	
		super.study();
	}

	@Override
	public void register() {
		
		super.register();
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
