import java.util.Date;



public class RegistrationOffice {

	@SuppressWarnings("deprecation")
	public Student getAStudent() {
		Student student = null;
		int i = (int) (6 * Math.random());

		switch (i) {
		case 0:
			student = new Student(1231, "Nefise", 2014, new Date("1/2/2000"), "Elementary Mathematics Education");
			break;
		case 1:
			student = new UndergraduateStudent(3452, "Fatma", 2013,new Date("9/18/1996"), "Industrial Design", "Mathematics");
			break;
		case 2:
			student = new VocationalStudent(2345, "Jessica", 2021, new Date("3/10/1997"), "Physics");
			break;
		case 3:
			student = new GraduateStudent(503, "Mert", 2004, "Mechanical Engineer", new Date("5/22/1993"), "Prof. Erdinç", "robotics");
			break;
		case 4:
			student = new MasterStudent(504, "Ali", 20022, "Computer Eengineer", new Date("6/5/1994"), "Prof. Mine", "Game Development");
			break;

		case 5:
			student = new PhdStudent(799, "Işıl", 2019, new Date("3/9/1992"),"Mathematics Education", "Prof. Şerife", "Algebra", false);
			break;
		}

		return student;

	}

	public void registerStudent(Student student) {

		if (student instanceof PhdStudent) {
			PhdStudent phdStudent = (PhdStudent) student;
			if (phdStudent.qualifyingExamTaken) {
				phdStudent.register();
				phdStudent.study();
				phdStudent.meetWithAdvisor();
				phdStudent.writeThesis();
				phdStudent.writePaper();

			} else {
				System.out.println("Registration is not completed for PHD student " + phdStudent.getName()
						+ " because  s/he couldn't complete the 'Qualifying Exam' successfully. ");
			}
		}

		else if (student instanceof MasterStudent) {
			MasterStudent masterStudent = (MasterStudent) student;
			masterStudent.register();
			masterStudent.study();
			masterStudent.meetWithAdvisor();
			masterStudent.writeThesis();

		} else if (student instanceof GraduateStudent) {
			GraduateStudent graduateStudent = (GraduateStudent) student;
			graduateStudent.register();
			graduateStudent.study();
			graduateStudent.meetWithAdvisor();
			graduateStudent.writeThesis();

		} else if (student instanceof UndergraduateStudent) {
			UndergraduateStudent underGraduate = (UndergraduateStudent) student;

			underGraduate.register();
			underGraduate.study();
			
		} else if (student instanceof VocationalStudent) {
			VocationalStudent vocationalStudent = (VocationalStudent) student;

			vocationalStudent.register();
			vocationalStudent.study();
			
		} else if (student instanceof Student) {
			student.register();
			student.study();

		}

	
}}