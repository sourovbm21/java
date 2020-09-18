package interfaceConcept;

public class TestBank {

	public static void main(String[] args) {
		

		
		System.out.println(USBank.min_bal);
		
		HSBCBank hs =new HSBCBank();
		
		hs.carloan();
		hs.credit();
		hs.debit();
		hs.educationloan();
		hs.transferMoney();
		hs.mutualFund();
		
		
		//run time polymorphism or dynamic polymorphism
		//child class object can be reffered by parent interface refference variable
	
		System.out.println("*****dynamic polymorphsim*******");
		USBank hb=new HSBCBank();
		hb.credit();
		hb.debit();
		hb.transferMoney();
		
		
		BrazilBank bb =new HSBCBank();
		bb.mutualFund();
		
	}

}
