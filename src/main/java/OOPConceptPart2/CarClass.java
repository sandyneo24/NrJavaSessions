package OOPConceptPart2;

public class CarClass {
	
	String name;
	int price;
	String engine;
	
	public CarClass(String name,int price,String engine)
	{
		this.name=name;
		this.price=price;
		this.engine=engine;
	}

	public static void main(String[] args) {
		
		 CarClass cc=new CarClass("BMW",10,"Automatic");
		 CarClass cc1=new CarClass("Audi",20,"Automatic");
		 CarClass cc2=new CarClass("Honda",30,"Manual");
		 
		 System.out.println(cc.name +" "+cc.price+" "+cc.engine);
		
	}

}
