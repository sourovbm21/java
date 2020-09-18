package file;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class fileDemo {

	public static void main(String[] args) {
		
		
		String id,name;
		try{	
			Formatter form =new Formatter("/Users/tohidur/Documents/javafileforPractice//myownfile.txt");	
			
		Scanner input=new Scanner (System.in);
		System.out.println("how many students : ");
		int num=input.nextInt();
		
		for (int i=0;i<num;i++) {
			System.out.println("please give me id and name");
			id=input.next();
			name=input.next();
			form.format("%s %s\r\n",id ,name);
		
			
		}
	
	form.close();
	}catch (Exception e) {
		e.printStackTrace();
	}
		
		
		
	}

}
