package TestPackage;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test1();

	}
	
	public static void test1()
	{
		try{
			System.out.println("Inside Test 1 Method");
			throw new RuntimeException("test");
		}catch(Exception e)
		{
			System.out.println("Inside Catch block");
		}
		finally
		{
			System.out.println("Inside Finally block");
		}
	}
	
	public static void test2()
	{
		try{
			
			System.out.println("Inside test2");
		}
		finally {
			System.out.println("Finally code in test2 method");
		}
	}
	public static void division()
	{
		int i=10;
		try{
			System.out.println("inside try block");
			int k=i/0;
		}catch(ArithmeticException e){
			System.out.println("Inside catch block");
			System.out.println("Devide by zero exception");
			
		}
		
		finally{
			System.out.println("Execute this code after any exception");
		}
	}

}
