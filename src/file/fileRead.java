package file;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class fileRead {

	public static void main(String[] args) {
		
   /*  try {
		File file =new File("/Users/tohidur/Documents/javafileforPractice/practice.txt");
		Scanner scanner =new Scanner(file);
		
		while(scanner.hasNext()) 
		           {
			String id=scanner.next();
			String name=scanner.next();
			System.out.println("id: "+id +" and "+"name : "+name);
		           }
          }catch(Exception e) {
	         System.out.print(e);
           }*/
		
   try {  
     File filee =new File("/Users/tohidur/Documents/javafileforPractice/practicee.txt");
     Scanner scanner=new Scanner(filee);
     while(scanner.hasNextLine()) {
    	String first= scanner.nextLine();
    	String second=scanner.nextLine();
    	String third=scanner.nextLine();
    	System.out.println(first +second+third);
     }
   }catch (Exception e)
   {
	   System.out.println(e);
   }
     
     
	}

}
