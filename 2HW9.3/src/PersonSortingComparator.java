import java.util.Comparator;

public class PersonSortingComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		int LastNameCompare = p1.getLastname().compareTo(p2.getLastname());
		int NameCompare = p1.getName().compareTo(p2.getName());
        return LastNameCompare==0 ? NameCompare :LastNameCompare ;
                                
    }
}


