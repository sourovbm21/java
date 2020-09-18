package interfaceConcept;

public class HSBCBank implements USBank,BrazilBank{

	///if we implements any interface then we have to implement all methods from interface 
	
	//is-a relatioship (between interface and class )
	
	
	public void credit() {
		System.out.println("hsbc credit");
	}
	
	
	public void debit() {
		System.out.println("hsbc debit");
	}
	
	

	public void transferMoney() {
		System.out.println("hsbc transferMoney");
	}
	

	public void educationloan() {
		System.out.println("hsbc educationloan");
	}
	
	

	public void carloan() {
		System.out.println("hsbc carloan");
	}


	@Override
	public void mutualFund() {
		System.out.println("BrazilBnak  mutualFund");
		
	}
	
}
