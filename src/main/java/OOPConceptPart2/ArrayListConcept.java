package OOPConceptPart2;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(500);
		
		System.out.println(ar.size());
		
		ar.add("Sandy");
		ar.add(10.11);
		ar.add('M');
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		
		//to print all the values of ArrayList : for loop
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		
		//Restricting Array List
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		
		ar1.add(100);
		//ar1.add("Tom");DOnt allow because integer type
		
		ArrayList<String> ar2=new ArrayList<String>();
		
		ar2.add("Tom");
		//ar2.size(100); Dont Allow becuase String

	}

}
