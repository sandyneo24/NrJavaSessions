package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {

    HSBCBank hs=new HSBCBank();
    hs.credit();
    hs.debit();
    hs.transferMoney();
    hs.educationLoan();
    hs.carLoan();

    //Dynamic polymorphism
    // Child class object can be referred by parent Interface reference variable
    
    UsBank b=new HSBCBank();
    //Overriden withods only allowed
    b.credit();
    b.credit();
    b.transferMoney();
    //b.educationLoan(); // Cant Access
    System.out.println(UsBank.min_Bal);
    
	}

}
