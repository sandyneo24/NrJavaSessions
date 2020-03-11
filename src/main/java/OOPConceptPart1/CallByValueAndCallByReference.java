package OOPConceptPart1;

public class CallByValueAndCallByReference {
	
	int p;
	int q;

	public static void main(String[] args) {
		

	CallByValueAndCallByReference cbv= new CallByValueAndCallByReference();
	int x=20;
	int y=30;
		
	int k=cbv.testsum(x, y);// Call by value OR pass by value;
	System.out.println(k);
	
	cbv.p= 50;
	cbv.q= 60;
	cbv.swap(cbv);
	System.out.println(cbv.p);
	System.out.println(cbv.q);
		
	}
	
	public int testsum(int a, int b)
	{
		a=30;
		b=50;
		int c= a+b;
		System.out.println(c);
		return c;
	}
	public void swap(CallByValueAndCallByReference t)
	{
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
	}

}
