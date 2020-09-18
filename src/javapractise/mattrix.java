package javapractise;

import java.util.Scanner;

public class mattrix {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		int [][]A=new int [2][3];
		int [][]B=new int [2][3];
	    int [][]C=new int [2][3];
		

//taking input for matrix A		
		System.out.println("Enter element for A matrix");
		for(int row=0;row<2;row++) {
			for(int col=0;col<3;col++) {
				A[row][col]=input.nextInt();
			}
		}
//taking input for matrix B
		System.out.println("Enter element for B matrix");
				for (int row=0;row<2;row++) {
					for (int col=0;col<3;col++) {
						B[row][col]=input.nextInt();
					}
					
					
				}
//printing matrix A 
	System.out.println("hei thats your  2D arrays");
		System.out.print("A = ");
		for(int row=0;row<2;row++) {
			for(int col=0;col<3;col++) {
			System.out.print("\t "+A[row][col]);
			}
			System.out.println();
		}

		//printing matrix B
		System.out.print("\n\n");
		System.out.print("B =");
		
				for(int row=0;row<2;row++) {
					for(int col=0;col<3;col++) {
					System.out.print("\t"+B[row][col]);
					}
				System.out.println();
				}
		
	//adding A and B Matrix{row +row and col+col}
				System.out.print("A+B");
				System.out.print("\n");
		for (int row=0;row<2;row++) {
			for(int col=0;col<3;col++) {
				C[row][col]=A[row][col]+ B[row][col];
				System.out.print("\t "+	C[row][col]);
			}
			System.out.println();
		}
		
		
	}

}
