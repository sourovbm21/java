package number;

public class numberConversion {

	public static void main(String[] args) {

//Swaping two integer 
		
		    int a=100;
		     int b=200;
		System.out.println("before swaping a :"+a);	
		System.out.println("before swaping b : "+b);		
		System.out.println("using third variable");	
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		
		
	System.out.println("after swaping using temp variable a :  "+a);	
	System.out.println("after swaping using temp variable b : "+b);	
	
	
	int x=100;
	int y=99;
	System.out.println("before swaping x : "+x);	
	System.out.println("before swaping y :  "+y);	
	System.out.println("without using third variable and + operator ");

		
	x=x+y;//15
	y=x-y;//15-10=5
	x= x-y ;//15-5=10
	
	System.out.println("after swaping using temp variable x :  "+x);	
	System.out.println("after swaping using temp variable y : "+y);	
	
	int p=5;
	int q=10;
	System.out.println("before swaping a :"+p);	
	System.out.println("before swaping b : "+q);		
	System.out.println("without using third variable and * operator ");	
	
	p=p*q;
	q=p/q;
	p=p/q;
	System.out.println("after  swaping a :"+p);	
	System.out.println("after  swaping b : "+q);		

	
	
	//using zor 
	int r=3;
	int t=4;
	r=r ^t;
	t=r^t;
	r=r^t;
	
	System.out.println("after  swaping a :"+r);	
	System.out.println("after  swaping b : "+t);
	
	
	
	
		
	}

}
