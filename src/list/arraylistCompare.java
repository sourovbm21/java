package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arraylistCompare {

	public static void main(String[] args) {
		

		//how to compare two arraylist in java 
		
		ArrayList <String >l1=new ArrayList<>(Arrays.asList("A","B","C","D","E"));
		ArrayList <String >l2=new ArrayList<>(Arrays.asList("A","B","C","D","E"));
		Collections.sort(l1);
		Collections.sort(l2);
		System.out.println(l1.equals(l2));
		System.out.println(l1==l2);
	}

}
