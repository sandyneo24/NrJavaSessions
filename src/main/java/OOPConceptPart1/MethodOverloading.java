package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(40);
		obj.sum(60,70);


	}
	
	//We can overload main method also
	
	public static void main(int i)
	{
		
	}
	
	//you can not create method inside method
	//duplicate methods---> i.e.. same method name with same number of arguments are not allowed, with different data types allowed
	
	public void sum()//0 parameter
	{
		System.out.println("Sum Method Zero parameter");
	}
	public void sum(int i)// 1 input parameter
	{
		System.out.println("Sum Method 1input parameter");
		System.out.println(i);
	}
	public void sum(int k, int l)//2 input parameter
	{
		System.out.println("sum method 2 input parameter");
		System.out.println(k+l);
	}

}
