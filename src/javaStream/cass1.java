package javaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class cass1 {

	public static void main(String[] args) {
		
     List <String > names=new ArrayList<String >();
     List <String > newnames=new ArrayList<String >();
     
     int count =0;
     
     names.add("abhijet");
     names.add("don");
     names.add("Alikiya");
     names.add("Adam");
     names.add("Anuska");
     names.add("Aam");
     
     for (int i=0;i<names.size();i++) {
    	 
    	if( names.get(i).startsWith("A")) {
    		//count=count+1;
    		count++;
    	
    	}
    	 
     }
     
		System.out.println("count is : "+count );
		
		
		
		Stream<String> S=names.stream().filter(s->s.startsWith("A"));
		System.out.println(S);
	}

}
