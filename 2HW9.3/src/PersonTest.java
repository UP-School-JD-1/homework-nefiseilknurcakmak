import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class PersonTest {
	public static void main(String[] args)
    {
 
		ArrayList<Person> plist = new ArrayList<>();

		Person p1 = new Person("Ali", "Kemal", new ArrayList<>(Arrays.asList("İstanbul", "Ankara")),
				new ArrayList<>(Arrays.asList("098", "987")));
		Person p2 = new Person("Veli", "Aksak", new ArrayList<>(Arrays.asList("Muğla", "Antalya")),
				new ArrayList<>(Arrays.asList("045", "397")));
		Person p3 = new Person("Fatma", "Barut", new ArrayList<>(Arrays.asList("İstanbul", "Sivas")),
				new ArrayList<>(Arrays.asList("765", "456")));
		Person p4 = new Person("Seda", "Öz", new ArrayList<>(Arrays.asList("Diyarbakır", "Ankara")),
				new ArrayList<>(Arrays.asList("847", "285")));
		Person p5 = new Person("Nehir", "Gencer", new ArrayList<>(Arrays.asList("Kırşehir", "Tekirdağ")),
				new ArrayList<>(Arrays.asList("054", "925")));
		Person p6 = new Person("Soner", "Aksak", new ArrayList<>(Arrays.asList("Konya", "Urfa")),
				new ArrayList<>(Arrays.asList("631", "215")));
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		plist.add(p5);
		plist.add(p6);
        
        Iterator<Person> personIterator = plist.iterator();
 

        System.out.println("Before Sorting:\n");
 
       
        while (personIterator.hasNext()) {
 
            System.out.println(personIterator.next());
        }
 
        
        Collections.sort(plist, new PersonSortingComparator());
 
        
        System.out.println("\n\nAfter Sorting:\n");
 
       
        for (Person person : plist) {
            System.out.println(person);
        }
    
	
	
	System.out.println("\nSearching by name (Key - Value) ");
	System.out.println();
	Map<String, Person> map = new HashMap<>();
	map.put(p1.getName(), p1);
	map.put(p2.getName(), p2);
	map.put(p3.getName(), p3);
	map.put(p4.getName(), p4);
	map.put(p5.getName(), p5);
	map.put(p6.getName(), p6);
	map.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));


	System.out.println("\nSearching by lastname (Key - Value) ");
	System.out.println();
	Map<String, Person> map1 = new HashMap<>();
	map1.put(p1.getLastname(), p1);
	map1.put(p2.getLastname(), p2);
	map1.put(p3.getLastname(), p3);
	map1.put(p4.getLastname(), p4);
	map1.put(p5.getLastname(), p5);
	map1.put(p6.getLastname(), p6);
	map1.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));
	
	
	
	System.out.println("\nSearching by addresse (Key - Value) ");
	System.out.println();
	Map<ArrayList<String>, Person> map2 = new HashMap<>();
	map2.put(p1.getAddresses(), p1);
	map2.put(p2.getAddresses(), p2);
	map2.put(p3.getAddresses(), p3);
	map2.put(p4.getAddresses(), p4);
	map2.put(p5.getAddresses(), p5);
	map2.put(p6.getAddresses(), p6);
	map2.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));

	
	System.out.println("\nSearching by phone numbers(Key - Value) ");
	System.out.println();
	Map<ArrayList<String>, Person> map3 = new HashMap<>();
	map3.put(p1.getPhones(), p1);
	map3.put(p2.getPhones(), p2);
	map3.put(p3.getPhones(), p3);
	map3.put(p4.getPhones(), p4);
	map3.put(p5.getPhones(), p5);
	map3.put(p6.getPhones(), p6);
	map3.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));
}

}