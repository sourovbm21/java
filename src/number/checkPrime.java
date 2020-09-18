package number;

import java.util.Scanner;

public class checkPrime {

	public static void main(String[] args) {
		
     int m,n,count=0;
		Scanner input=new Scanner(System.in);
		 System.out.println("please enter start  number : ");
		 m=input.nextInt();
		 System.out.println("please enter finish  number : ");
		 n=input.nextInt();
		 
		 for (int i=m;i<=n;i++) 
		 {
			 
			 
			 for(int j=2;j<m-1;j++) 
			 {
				 
				 if(i%j==0)
				 {
					 count++;
					 break;
				 }
			 }
			 if (count ==0)
			 {
				 System.out.println(i);
				 
			 }
			 count=0;
		 }
		
		
		
	}

}
