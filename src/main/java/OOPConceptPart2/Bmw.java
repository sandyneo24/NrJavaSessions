package OOPConceptPart2;

public class Bmw extends Car { //Has- A relationship
	
	//when same method is presrent in parent class as well as in child class with same name 
	//           and same number of arguments is called method overriding
	public void start() //Overriden method
	{
		System.out.println("BMW---Start");
	}
	public void theftSafety()
	{
		System.out.println("BMW---Theft Safety");
	}
	public void stop() //Overriden method
	{
		System.out.println("BMW---Stop");
	}

}