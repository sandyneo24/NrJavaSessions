package JavaCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList();
		ll.add("test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		//Print
		System.out.println("Contents Of Linked List" +ll);
		//Add First
		ll.addFirst("Sandeep");
		ll.addLast("Test Automation");
		System.out.println("Contents Of Linked List" +ll);
		//Get
		System.out.println(ll.get(0));
		//Set
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		
		//Remove First and Last Element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Contents Of Linked List" +ll);
		
		ll.remove(2);
		System.out.println("Contents Of Linked List" +ll);
		
		//How to print all values of Linked List
		//For Loop
		System.out.println("Using For Loop");
		
		 for(int i=0;i<ll.size();i++)
		 {
			 System.out.println(ll.get(i));
		 }
		
		//Advance For Loop
		 
		 System.out.println("Using Advance For Loop");
		 for(String str:ll){
			 System.out.println(str);
		 }
		 
		//Iterator
		 System.out.println("=======Using Iterator");
		Iterator<String> it= ll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		 
		//While Loop
		System.out.println("Using While");
		int num=0;
		while(ll.size()>num){
			System.out.println(ll.get(num));
			num++;
		}
		
	}

}
