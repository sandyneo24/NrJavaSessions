package OOPConceptPart2;

import org.testng.annotations.Test;

public class TestCar {
	

	public static void main(String[] args) {
		
		//Static Polymorphism or Compile time Polymorphism
		Bmw b=new Bmw();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		//c.theftSafety(); ---> You cant inherit child class properties
		
		//Top Casting
		Car c1=new Bmw();//--> Child class object can be reffered by parent class reference variable
		                 //    is called dynamic polymorphism or run time polymorphism.
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.theftSafety(); --> You cannot access this method
		
		//Down Casting
		//Bmw b1=(Bmw) new Car(); --->  java.lang.ClassCastException
		
	}

}
