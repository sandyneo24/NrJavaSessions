package naveenAutomation.automationTraining;

public class ArrayConcept {

	public static void main(String[] args) 
	{
		//One Dimensional Arry
		//Dis Advantages
		//1. Size is Fixed - Static Array.-- To overcome this we use collections-- Arry list, Hash table-- Use dynamic Array
	    //2. Can store only similar data types.. To over come this problem we use Object Array
	
		int i[]= new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i.length);
		//ArrayIndexboundException
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		//string Array
		
		String st[]= new String[10];
		st[0]="Test";
		st[1]="String Array";
		System.out.println(st[1]);
		
		//Object Array
		
		Object ob[]=new Object[6];
		ob[0]= "Sandeep";
		ob[1]= 25;
		ob[2]= 12.33;
		ob[3]= "03/07/86";
		ob[4]= "M";
		ob[5]= "Gunatakal";
		System.out.println(ob[5]);		

	}

}
