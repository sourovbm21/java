package practise;

import java.util.HashMap;
import java.util.HashSet;

public class duplicateElementofArray {

	public static void main(String[] args) {
		
		
   String names[]= {"java","javaScript","C","ruby","java","C"};;
//   
//   for (int i=0;i<names.length;i++) {
//	    for (int j=i+1;i<names.length;j++) {
//	    	
//	    	if(names[i].equals(names[j])) {
//	    		System.out.println("duplicate number is : "+names[i]);
//	    	}
//	    }
// 	   
//   }
   
   //using set 
   //time complexity is O(n)
   HashSet<String> store=new HashSet<String>();
   for(String name:names) {
	    
	   if (store.add(name)==false) {
		   System.out.println("duplicate is using HashSet : "+name);
	   }
	   
   }
   
   ////using HashMap
   HashMap <String ,Integer > storeMap=new HashMap<String ,Integer>();
		
		
	}

}
