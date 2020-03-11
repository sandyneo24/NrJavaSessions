package OOPConceptPart2;

public class ConstructorConcept {
	//class variables
	String name;
	int age;
	
	public ConstructorConcept()//0 paremeter constructor
	{
		System.out.println("Default constructor");
	}
	
	public ConstructorConcept(int i)//1 paremeter constructor
	{
		System.out.println("1 para constructor");
		System.out.println(i);
	}
	
	public ConstructorConcept(int i, int j)//2 paremeter constructor
	{
		System.out.println("2 para constructor");
		System.out.println(i+" "+j);
	}
	
	public ConstructorConcept(String name, int age)
	{
		this.age=age;//this.classvariable = local variable;
		this.name=name;
		System.out.println(age);
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		
		ConstructorConcept cc=new ConstructorConcept();
		ConstructorConcept cc1=new ConstructorConcept(10);
		ConstructorConcept cc2=new ConstructorConcept(10,20);
		ConstructorConcept cc3=new ConstructorConcept("Tom",25);
		System.out.println(cc3.name);
		System.out.println(cc3.age);

	}

}
