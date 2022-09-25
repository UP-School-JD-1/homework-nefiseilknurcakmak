import java.util.ArrayList;
import java.util.Objects;

public class Person {
	    private String name;
	    private String lastname;
	    private ArrayList<String> addresses;
	    private ArrayList<String> phones;

	    public Person(String name, String lastname, ArrayList<String> addresses, ArrayList<String> phones) {
	        this.name = name;
	        this.lastname = lastname;
	        this.addresses = addresses;
	        this.phones = phones;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getLastname() {
	        return lastname;
	    }

	    public ArrayList<String> getAddresses() {
	        return addresses;
	    }

	    public ArrayList<String> getPhones() {
	        return phones;
	    }

	 

	    @Override
		public int hashCode() {
			return Objects.hash(addresses, name, phones, lastname);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			return Objects.equals(addresses, other.addresses) && Objects.equals(name, other.name)
					&& Objects.equals(phones, other.phones) && Objects.equals(lastname, other.lastname);
		}

		@Override
	    public String toString() {
	        return name + " " + lastname + " " + addresses.toString() + " " + phones.toString();
	    }

	
}
