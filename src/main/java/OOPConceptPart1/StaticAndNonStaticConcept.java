package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	
	//scope of global variable is will be available across all the functions with some conditions
	
	String name="tom";//Non Static global varaible
	static int age=25;//Static global varaible

	public static void main(String[] args) {
		//How to call static method and variables
		//Direct calling
		sum();
		//calling by class name
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		//How to call nonstatic methods and variables
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		obj.sendMail();
		
		//can i use static method with the help of obj reference
		obj.sum(); //its not a proper way
		
		//The static method sum() from the type StaticAndNonStaticConcept should be accessed in a static way
	}
	public void sendMail()
	{
		System.out.println("Send mail method");
	}
	public static void sum()
	{
		System.out.println("Sum Method");
	}

}
