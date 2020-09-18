package interfaceConcept;

public interface USBank {

	//only method declaration -no body /only prototype
	//we can declare only variable 
	//value of variable not be change
	//value is static by default and final in nature 
	//no static method 
	//not main method in interface 
	//we can not create the object of interface 
	//Interface is abstract in nature 
	int min_bal=100;
	
	public void credit();
	
	public void debit();
	public void transferMoney();
	
	
	
}
