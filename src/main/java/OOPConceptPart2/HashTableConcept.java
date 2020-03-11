package OOPConceptPart2;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h= new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		h.put(3, 300);
		
		System.out.println(h.size());
		
		System.out.println(h.get(2));
		System.out.println(h.get("C"));
		
		h.put(1, "Tom");
		h.put("Ram", 100);
		
		Hashtable<Integer,Integer> h1= new Hashtable<Integer,Integer>();
		
		h1.put(1, 100);
		//h1.put("Tom", 300); --> Wont Allow
		
		Hashtable<Integer,String> h2= new Hashtable<Integer,String>();
		
		h2.put(1, "Sandy");
		
		
		

	}

}
