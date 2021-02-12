import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashSet, TreeSet, LinkedHashSet implements Set interface
		// does not accept duplicate values
		// There is no guarantee that elements stored in sequential order
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("he");
		hs.add("she");
		
		
		hs.add("INDIA");
		System.out.println(hs);
		
		hs.remove("UK");
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		Iterator<String> i = hs.iterator(); // Iterate through every object present in the set
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
