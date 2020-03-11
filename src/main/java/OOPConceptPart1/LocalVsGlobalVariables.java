package OOPConceptPart1;

public class LocalVsGlobalVariables 
{
	//Global vars or Class variables
	String name="Tom";
	int age=25;
	
	public static void main(String[] args)
	{
		LocalVsGlobalVariables obj=new LocalVsGlobalVariables();
		int i=10;//Local Varaible
		System.out.println(i);
		System.out.println(obj.age);
	}
	public void sum()
	{
		int i=15;
		int j=20;
	}

}
