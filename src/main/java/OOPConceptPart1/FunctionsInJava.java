package OOPConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) 
	{
		FunctionsInJava fj=new FunctionsInJava();
		//One object will be created, fj is the reference variable, reference to the object
		//after creating the object, the copy of all non static methods will be given to this object
		fj.test();
		int addd=fj.abc();
		System.out.println(addd);
		String s1=fj.qa();
		System.out.println(s1);
		int dd=fj.div(30, 10);
		System.out.println(dd);
		//main method is void--> Never return a value
	}
	//Non static Methods
	//void means doesn't return any value
	public void test() //no input no output
	{
		System.out.println("Test Method");
	}
	// Here we are returnin value which is integer type so we must mention before method
	public int abc() //no input some output
	{
		int a=10;
		int b=20;
		int c= a+b;
		return c;
	}
	
	public String qa()// no input some output
	{
		System.out.println("QA method");
		String s="Selenium";
		return s;
	}
	
	//return type is int;
	//x, y are input parameters or arguments
	public int div(int x,int y)
	{
		System.out.println("Divisions Method");
		int d=x/y;
		return d;
		
	}

}
