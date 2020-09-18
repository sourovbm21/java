package javapractise;

import java.util.Scanner;

public class diagonalUpperLowerMatrix {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int A [][]=new int[3][3];
		int SumOfDiagonalElements=0;
		int SumOfUpperElements=0;
		int SumOfLowerElements=0;
System.out.println("please give me input : ");		
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				A[row][col]=input.nextInt();
			}
		}
		
	//diagonal ,upper and lower triange sum
	
		for (int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				
				if(row==col) {
					SumOfDiagonalElements=SumOfDiagonalElements+A[row][col];
				}
				if(row<col) {
					SumOfUpperElements=SumOfUpperElements+A[row][col];
				}
				if(row>col) {
					SumOfLowerElements=SumOfLowerElements+A[row][col];
				}
			}
		}
		System.out.println("SumOfDiagonalElements : "+SumOfDiagonalElements);
		System.out.println("SumOfUpperElements : "+SumOfUpperElements);
		System.out.println("SumOfLowerElements : "+SumOfLowerElements);
		
		
		
		
		
		

	}

}
