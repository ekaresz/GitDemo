package coreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();  // first one is for key, next one is for value
		hm.put(0, "hello");
		hm.put(1, "Gudbye");
		hm.put(42, "morning");
		hm.put(3, "evening");
		hm.put(5, null);
		hm.put(6, null);
		hm.put(7, null);
		hm.put(8, null);
		hm.put(9, null);
		hm.put(190, null);
		hm.put(611, null);
		
		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));
		
		Set sn = hm.entrySet(); // make all these key value pairs as a set
		
		Iterator it = sn.iterator();
		
		while(it.hasNext()) {
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println("Key: " + mp.getKey());
			System.out.println("Value: " + mp.getValue());
			
		}
		
	}

}
