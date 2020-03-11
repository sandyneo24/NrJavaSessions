package OOPConceptPart1;

public class Car {
	//class Variables
	int model;
	int wheel;

	public static void main(String[] args) 
	{
		//new Car() ---> This is object of Car class
		//new keyword is used to create the object
		//a,b,c are the object reference variables
		
		Car a= new Car();
		Car b= new Car();
		Car c= new Car();
		
		a.model= 2015;
		a.wheel= 4;
		
		b.model= 2016;
		b.wheel= 4;
		
		c.model= 2017;
		c.wheel= 4;
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		System.out.println("After shifting references");
		
		a=b;
		b=c;
		c=a;
		
		a.model=20;
		System.out.println(a.model);
		c.model=50;
		System.out.println(a.model);		
		

	}

}
