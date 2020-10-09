package practise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicateElementofArray {

	public static void main(String[] args) {
		
		
   String names[]= {"java","javaScript","C","ruby","java","java"};;
   
//   for (int i=0;i<names.length;i++) {
//	    for (int j=i+1;i<names.length;j++) {
//	    	
//	    	if(names[i].equals(names[j])) {
//	    		System.out.println("duplicate number is : "+names[i]);
//	    	}
//	    }
// 	   
//   }
   

   
   ////using Hashset(time complexity is O(n)
   HashSet<String > store=new HashSet<String>();
   for (String name:names) {
	   
	  if( store.add(name)==false) {
		  System.out.println("dupliii : "+name);
	  }
	   
   }
	//USing hashmap
   System.out.println("******printing using HashMap*****");
   
   Map<String ,Integer>hm=new HashMap<String ,Integer>();
   
   for (String name:names) {
	   Integer count =hm.get(name);
	   if(count==null) {
		   hm.put(name,1);
	   }else {
		   hm.put(name,count++);
	   }
   }
   
   
   Set<Entry<String ,Integer>> entryset=(Set<Entry<String, Integer>>)hm.entrySet();
   
   for (Entry entry:entryset)//Entry<String, Integer> entry:hm.entrySet()
   {
//	   
//        if(entry.getValue()>1) {
//        	
//        }

   }
   
   
   
	}

}
