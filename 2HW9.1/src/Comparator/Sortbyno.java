package Comparator;

import java.util.Comparator;

public class Sortbyno implements Comparator<Student> {

	  @Override
	  public int compare(Student s1, Student s2)
	    {
	 
	        return s1.no - s2.no;
	    }

}
