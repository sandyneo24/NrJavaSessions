package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String st="10";
		System.out.println(st+100);
		
		//Data conversion String to int
		int i=Integer.parseInt(st);
		System.out.println(i);
		
		//Types of Wrapper classes--> Double, Charecter, Boolean
		
		//String to Double
		String y="12.12";
		double d=Double.parseDouble(y);
		System.out.println(d);
		
		//String to boolean
		String z="true";
		boolean n=Boolean.parseBoolean(z);
		System.out.println(n);
		
		//int to String
		
		int j=200;
		String s=String.valueOf(j);
		System.out.println(s+200);
		
		String u="100AS";
		Integer.parseInt(u); // java.lang.NumberFormatException

	}

}
