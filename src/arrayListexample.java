import java.util.ArrayList;

public class arrayListexample {

	// ArrayList, LinkedList, Vector - implementing List interface, and they accept duplicate values
	// Arrays have fixed size where arraylist can grow dynamically
	// you can access and insert any value in any index
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Rahul");
		a.add("Rahul");
		a.add("java"); // arraylist has a dynamic size
		a.add("java");
		System.out.println(a);
		
		a.add(0, "student"); // add element to the 0th index
		System.out.println(a);
		
//		a.remove(1);
//		a.remove("java");
		System.out.println(a);
		
		System.out.println(a.get(2)); // when it's an Array we say a[2]
		
		// testing if this keyword is present in the array
		System.out.println(a.contains("testing")); // checks whether testing is present or not
		
		System.out.println(a.indexOf("java")); // if I want to know what is the index of an element
		
		System.out.println(a.isEmpty()); // checks if arraylist is empty
		System.out.println(a.size()); // gives the size of an array
		
		
	}

}
