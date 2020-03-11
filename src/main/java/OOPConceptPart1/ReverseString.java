package OOPConceptPart1;

public class ReverseString {

	static String st="Sandeep@%$#^#&#^^#";
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer(st);
		sb.reverse();
		System.out.println(sb);
		String stt=st.replaceAll("[^a-z]", " ");
		System.out.println(stt);

	}

}
