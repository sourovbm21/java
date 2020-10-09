package abstruction;

public class TestBank {

	public static void main(String[] args) {
		

		HDFCBank hb=new HDFCBank();
		hb.credit();
		hb.debit();
		hb.discount();
		hb.loan();
		hb.funds();
		
		//dynamic polymorphism
		bank b=new HDFCBank();
		b.credit();
		b.debit();
		b.discount();
		b.loan();
	
		
		
		
	}

}
