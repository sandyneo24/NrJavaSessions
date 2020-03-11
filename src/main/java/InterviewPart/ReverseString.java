package InterviewPart;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="Selenium";
		
		//Using For Loop
		int len=s.length(); //8
		
		String rev= "";
		
		for(int i=len-1; i>=0 ;i--)
		{
			rev=rev+ s.charAt(i);
		}
		System.out.println(rev);
		
		//Using String Buffer
		
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());

	}

}
