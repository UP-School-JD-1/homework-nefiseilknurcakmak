import java.util.Date;

public class Student {
    int no;
	String name;
	int year;
	String major;
	Date dob;

	public Student(int no, String name, int year,Date dob, String major)
	{
		this.no=no;
		this.name=name;
		this.year=year;
		this.dob=dob;
		this.major=major;

	}


	public void study() {
		System.out.println(name + " is studying in department of " + major );
		
	}
	
	public void register() {
		System.out.println(name+ " has registered. ");  
		
	}
	
	
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}


	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", year=" + year + ", major=" + major + ", dob=" + dob + "]";
	}

}
