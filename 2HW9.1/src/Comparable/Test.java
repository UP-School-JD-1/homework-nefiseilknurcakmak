package Comparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
			ArrayList<Student> list = new ArrayList<Student>();
		    list.add(new PhdStudent(799, "Işıl", 2019, new Date(3/9/1992),"Mathematics Education", "Prof. Şerife", "Algebra", false));
		    list.add(new UndergraduateStudent(3452, "Fatma", 2013,new Date(9/18/1996), "Industrial Design", "Mathematics"));
		    list.add(new VocationalStudent(2345, "Jessica", 2021, new Date(3/10/1997), "Physics"));
		    list.add(new MasterStudent(504, "Ali", 20022, "Computer Eengineer", new Date(6/5/1994), "Prof. Mine", "Game Development"));
		
		
     
     Collections.sort(list);

     System.out.println("Students after sorting by year : ");
     
     for (Student students: list)
     {
         System.out.println(students.toString());
     }
 }
 }	
	
	
	
	
	
	
	
	
	
	
		
	

