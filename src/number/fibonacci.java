package number;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		

		Scanner input =new Scanner(System.in);
		System.out.println("how many number : ");
		int n=input.nextInt();
		int first =0;
		int second=1;
		int fibo;
		
		System.out.print(first+" " +second);
		for (int i=3;i<=n;i++) {
			fibo=first+second;
			System.out.print(" "+fibo);
			first=second;
			second =fibo;
		}
		
		System.out.println();
	}

}
