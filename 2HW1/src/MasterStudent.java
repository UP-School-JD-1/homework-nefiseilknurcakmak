
public class MasterStudent extends GraduateStudent {

	public MasterStudent(int no, String name, int year, String major, String advisor, String thesis) {
		super(no, name, year, major, advisor, thesis);
		
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
		
		System.out.println(  getName() + " that master student is writing thesis  about " + getThesis());
		}

	@Override
	public void meetWithAdvisor() {
		
		System.out.println( getName() + " that master student meets once in a week with advisor who is  " + getAdvisor());
	}
	    }
	


