package AbstractionConcept;

public abstract class Bank {
	
	//Partial Abstraction
	//Hiding the implementation Logic is called Abstraction
	//anstract class can have anstract methods and non abstract methods
	//cannot create the object of Abstract classes
	
	public abstract void loan();//Abstract Method--- No method body
	
	//Non Abstract methods
	
	public void credit()
	{
		System.out.println("Bank---Credit");
	}
	public void debit()
	{
		System.out.println("Bank---Debit");
	}

}
