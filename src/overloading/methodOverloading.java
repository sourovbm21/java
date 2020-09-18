package overloading;

public class methodOverloading {

	public static void main(String[] args) {
		

	
		sum(5,4);
		//method overloading happened when methods are same name with different arguments or different parameters within same class
		
		
	}
	
	
	public static void sum() {
		System.out.println("sum method o param");
	}
	public static void sum(int i) {
		System.out.println("sum method 1 param");
	}

	public static void sum(int i ,int g) {
		System.out.println("sum method 2 param");
		System.out.println(	i*g);
	}


}
