package OOPConceptPart2;

public class HSBCBank implements UsBank, BrazilBank //Acheiving Multiple Inheritence
{
	//If a class is implementing any Interface , 
	//Then its mandatory to define/ Override all the methods of interface
	
	
	//These 3methods from USBank
	public void credit()
	{
		System.out.println("HSBC---Credit");
	}
	public void debit()
	{
		System.out.println("HSBC---Debit");
	}
	public void transferMoney()
	{
		System.out.println("HSBC---Transfer Money");
	}
	
	//These 2 methods of HDFC Class
	public void educationLoan()
	{
		System.out.println("HSBC---Edu Loan");
	}
	public void carLoan()
	{
		System.out.println("HSBC---Car Loan");
	}
	
	//This Method Overriding from BrazilBank
	public void mutualFund()
	{
		System.out.println("Brazil Bank--Mutual Fund");
	}

}
