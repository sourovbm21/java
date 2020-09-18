package practise;

import java.util.Random;
import java.util.Scanner;

public class math {

	public static void main(String[] args) {
	
		
	System.out.println(Math.random());	;
	System.out.println(Math.random());	;
	Random r = new Random();   
	// Generates random integers 0 to 49  
	//int x =
			r.nextInt();   
	int bond = 10;
	// Generates random integers 0 to 999  
	int y = r.nextInt(bond);   
	// Prints random integer values  
	System.out.println("Randomly Generated Integers Values");  
	System.out.println(	r.nextInt()  );   
	System.out.println(y);
	
	System.out.println("i am doing some task");
	   
	creatingComplex();
	totalSum(5,6);
	
	
	
	}

	private static void totalSum(int i, int j) {
		
		
		int Tosum=i+j;
		System.out.println("Tosum is : "+Tosum);
		return;
		
	}

	private static void creatingComplex() {
		System.out.println("i am in a method now ");
	//Scanner s=new Scanner(System.in);
		Random r=new Random();
		int a=r.nextInt(1);
		int b=r.nextInt(2);
		int sum=a+b;
		System.out.println("sum is : "+sum);
		return;

		}
	
		
	}


