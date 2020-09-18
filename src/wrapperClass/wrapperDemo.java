package wrapperClass;

public class wrapperDemo {

	public static void main(String[] args) {
		

	//Autoboxing=converting primitive to object
	//Unboxing=converting object to primitive
		
	//unboxing 	
		Integer i=new Integer(5);
		System.out.println("i is : "+i);
		
		
		Integer h=i.intValue();
		System.out.println("h is : "+h);
		
	//Autoboxing 
		
		int g=10;
		System.out.println("g value is : "+g);
	Integer g1=g;//Integer.valueOf(g);
		System.out.println("g1 value is : "+g1);
		System.out.println("g value is : "+g);
		
		
//converting int to string 
		//if from any data type to convert string then use .toString
		//and convert to any other then use .parseInt
		
		int v=21;
		
		String s=Integer.toString(v);
		System.out.println("integer s is : "+s);
		
		String A="32";
	int v1=	Integer.parseInt(A);
	System.out.println("v1 is : "+v1);
		
		
	}

}
