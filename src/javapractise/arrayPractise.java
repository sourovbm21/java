package javapractise;

import java.util.Scanner;

public class arrayPractise {

	public static void main(String[] args) {
	
	double sum=0;
		/*int[] a=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		int sumnumber =a[0]+a[1]+a[2]+a[3]+a[4];
		System.out.println("sum is: "+sumnumber);
		for (int i=0;i<5;i++)
		{
			sum=sum +a[i];
			
		}*/
		
		//System.out.println("my sum is : "+sum);
	System.out.println("i am in second test : "	);
		Scanner input=new Scanner(System.in);
		double[]n =new double [5];
		System.out.print("please enter number: ");	
		
	    for (int i=0;i<n.length;i++)
		{
	    	n[i]=input.nextDouble();
			
		}
	     for (int i=0;i<n.length;i++){
	    	  sum=sum+n[i];
	     }
	  
	  System.out.println("my sum is : "+sum);
	  double avg=sum/n.length;
	  System.out.println("my avg is : "+avg);

//maximum value 
	  double max=n[0];
	  double min=n[0];
	  for (int i=0;i<n.length;i++) {
		 if(max<n[i]) {
			 max=n[i];
		 }
		 if(min>n[i]) {
			  min=n[i];
		  }
	  }
	 
	  
//minimum
	  
	  
	  System.out.println("my maximum is : "+max);
	  System.out.println("my manimum is : "+min);
	  
	  
	  
	  
	}

}
