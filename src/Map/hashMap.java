package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) {
		
    // Map(i)-->Hashmap,HashTable
		
		/*use of map 
		 * --group of object in the form of pair or key and value 
		 * duplicate key are not allowed but duplicate value are allowed 
		 *insertion order is not preserve 
		 *not synchronized 
		 *not thread safe 
		 *performance are fast comparison to hashTable */
     
     HashMap<String ,Integer > hm =new HashMap<String ,Integer >();
     
     
     hm.put("sourov", 21);
     hm.put("maliha",22);
     hm.put("arish", 10);
     hm.put("azan",3);
     
     hm.put("nisha", 28);
     hm.put("daiyan",29);
     hm.put("sourov",22);
     
    System.out.println(hm);
    System.out.println(hm.get("sourov"));
   // System.out.println(hm.remove("sourov"));
    
    System.out.println(hm.keySet());//returns all the key as a set where duplicate are not allowed 
    System.out.println("here is the values : "+hm.values());//[22, 10, 22, 29, 3, 28]
    System.out.println("return all as a set : "+hm.entrySet());//[sourov=22, arish=10, maliha=22, daiyan=29, azan=3, nisha=28]
    System.out.println(hm.containsKey("sourovv"));
    System.out.println(hm.containsValue(4));
    System.out.println("is empty : " +hm.isEmpty());
   
    
   System.out.println("map size is : "+hm.size());
    
    
    
      for(Object s:hm.keySet())
      {
    	  System.out.println(s);
      }
 
     for (Object   i:hm.values())
     {
    	 System.out.println(i);
     }
     
    
     for (Object j:hm.keySet()) 
     {
    	System.out.println( j+" "+hm.get(j));
     }
     
     //using entry method
     
     System.out.println("*****using entry method*********");
     
     for(Entry<String, Integer> entry:hm.entrySet())
     {
    	System.out.println( entry.getKey()+" "+entry.getValue());
     }
     
   //using iterator 
     System.out.println("*****using interator  method*********");
     Set s=hm.entrySet();
    Iterator itr= s.iterator();
    
    while(itr.hasNext()) {
      Entry	entry=(Entry) itr.next();
      System.out.println(entry.getKey()+" "+entry.getValue());
    	
    	
    }
		
	}
	
	
	
	

}
