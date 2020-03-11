package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFCBank hdfc=new HDFCBank();
		hdfc.credit();
		hdfc.debit();
		hdfc.loan();
		hdfc.funds();
		
		Bank b=new HDFCBank();
		b.credit();
		b.debit();
		b.loan();
	

	}

}
