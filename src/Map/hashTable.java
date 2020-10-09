package Map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class hashTable {

	public static void main(String[] args) {
		

		//thread safe 
		//null are not accepted 
		//before 1.2 
		//legecy class 
		//slow comparison to Hashmap
		//key -->object-->Hashcode -->value
		//default capacity is 11
		//and load factor is 0.75
		
		
//		//Hashtable t=new Hashtable(initial capacity,fill ratio/load factor);
//		Hashtable t=new(initial capacity);
		
		Hashtable<String ,Integer> ht=new Hashtable<String ,Integer> ();
		ht.put("sourov", 32);
		ht.put("maliha", 25);
		ht.put("myrah", 004);
		ht.put("arisha", 10);
		ht.put("azan", 3);
		ht.put("nirob", 35);
		
		System.out.println(ht.keySet());//[arish, nirob, myrah, sourov, maliha, azan]
		System.out.println(ht.values());//[10, 35, 4, 32, 25, 3]
		System.out.println(ht);//{arish=10, nirob=35, myrah=4, sourov=32, maliha=25, azan=3}
		System.out.println(ht.containsKey("maliha"));
		System.out.println(ht.containsValue(32));
		Map htt=(Hashtable)ht.clone();
		System.out.println(htt);
	
		System.out.println("*******printing  table using keyset *****");
		for(String s:ht.keySet())
		{
			System.out.println(s+" "+ht.get(s));
		}
		
		System.out.println("*******printing  table using entrySet *****");
		
		//entry specific methods
		for (Entry<String ,Integer> entry:ht.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			System.out.println(entry.hashCode());
			
		}
		
		//using iterator method 
		System.out.println("*******printing  table  using iterator method  *****");

		Set se=ht.entrySet();
		Iterator it=se.iterator();
		
		while(it.hasNext()) {
			Entry entry=(Entry )it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
	
		
		
	}

}
