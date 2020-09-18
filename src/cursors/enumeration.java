package cursors;

import java.util.Enumeration;
import java.util.Vector;

public class enumeration {

	public static void main(String[] args) {
	   	
    //only for legacy class
		//only forward direction
		//only read access
		//hasMoreElements(),nextElement();
		//Enumeration e=v.elements();
		
		Vector<Integer> v= new Vector<Integer>();
		
		for(int i=0;i<=10;i++) {
			
			v.add(i);
			
		}
		
		Enumeration e=v.elements();
		
		while(e.hasMoreElements()) {
			Integer I=(Integer) e.nextElement();
			
			if(I%2==0) {
				System.out.println(I);
			}
		}
		System.out.println(v);
		
		
		
	}

}
