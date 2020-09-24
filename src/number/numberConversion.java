package number;

public class numberConversion {

	public static void main(String[] args) {

//Swaping two integer 
		
		    int a=10;
		     int b=15;
		System.out.println("before swaping a :"+a);	
		System.out.println("before swaping b : "+b);		
		
		     int k=0;
		     k=a;//10
		     a=b;//15
		     b=k;//10
		
	System.out.println("after swaping using temp variable a :  "+a);	
	System.out.println("after swaping using temp variable b : "+b);	
	
	int x=5;
	int y=10;
	System.out.println("before swaping x : "+x);	
	System.out.println("before swaping y :  "+y);	
	
	x=x+y;
	y=x-y;
	x=x-y;
		
	System.out.println("after swaping using temp variable x :  "+x);	
	System.out.println("after swaping using temp variable y : "+y);	
	
		
	}

}
