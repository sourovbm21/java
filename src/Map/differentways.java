package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class differentways {

	public static Map<String ,Integer >marksMap;
	static {
		marksMap=new HashMap<>();
		marksMap.put("sourov",100);
		marksMap.put("maliha",200);
		marksMap.put("myrah",300);
	}
	
	public static void main(String[] args) {
		

		System.out.println(differentways.marksMap.get("maliha"));
		
		
		//immutable map with one single entry
		Map<String ,String  >map1=Collections.singletonMap("test","putting test value ");
		System.out.println(map1.get("test"));
 //adding class object in hash map
		
		Map<Integer,employeee> emp=new HashMap<Integer,employeee>();
		employeee e1=new employeee("sourov","male",31);
		employeee e2=new employeee("maliha","female",25);
		employeee e3=new employeee("myrah","female",1);
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		
	 for (Entry<Integer,employeee>m:emp.entrySet()) {
		 
		int key= m.getKey();
		employeee e= m.getValue();
		System.out.println("key: "+key +"employee: "+e.age+e.name+e.sex);
	 }
	
	
		
	}

}
