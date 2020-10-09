package abstruction;

public abstract class bank {

	
	//partial abstraction
	//abstract class can have abstract  method and not abstract method
	
	
	public abstract void loan();
	public abstract void discount();
	
	
	//non abstrac method
	public void credit() {
		System.out.println("bank credit ");
	}
	
	public void debit() {
		System.out.println("bank debit ");
	}
	
	
	
}
