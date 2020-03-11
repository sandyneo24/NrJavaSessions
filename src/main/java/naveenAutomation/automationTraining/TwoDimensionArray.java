package naveenAutomation.automationTraining;

public class TwoDimensionArray {

	public static void main(String[] args) {

		String x[][]=new String[3][5];
		System.out.println(x.length);//Total no of rows
		System.out.println(x[0].length);//total no of columns
		//1st row
		x[0][0]= "sandeep";
		x[0][1]= "Mahesh";
		x[0][2]= "Phaneesh";
		x[0][3]= "Sree";
		x[0][4]= "Dada";
		System.out.println(x[0][1]);
		//Print the all values of 2D Array
		for(int row=0;row<x.length;row++)
		{
			for(int col=0;col<x[0].length;col++)
			{
				System.out.println(x[row][col]);
			}
			
		}
		
				
	}

}
