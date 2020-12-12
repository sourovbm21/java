package rahultast;

import java.util.ArrayList;

public class thirdsolving {

	public static void main(String[] args) {
		
		//compare same index of 2 different arrays and create another array for matching values
		
		
		int a[] = {1,4,8,15,20,17};
		int b[]= {1,3,4,15,20,25};//1,4,15,20
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for (int i=0;i<a.length;i++) {
			
			for (int j=0;j<b.length;j++) {
				
				if (a[i]==b[j]) {
					al.add(a[i]);
					
				}
			}
		}
		
//		Object []c=al.toArray();
//		System.out.println("matching array is TO array : "+c);
//		
		for (int o=0;o<al.size();o++) {
			
			System.out.println("matching array is : "+al.get(o));
		}
		
		for (Object aLL:al) {
			System.out.println("matching array using enhanced for loop: "+aLL);
		}
	
		//sorting an array ascending or descending order
		
		int ab[]= {1,3,2,10,5,7,9};//1,2,3,5,7,9,10
		        //{a,b,c,d};
		
		int temp;
		for (int h=0;h<7;h++) {
			
			for (int hm=h+1;hm<7;hm++) {
				
				if(ab[h]>ab[hm]) {
					temp=ab[h];
					ab[h]=ab[hm];
					ab[hm]=temp;
				}
			}
		}
		
		for (int i=0;i<ab.length;i++) {
			
			
			System.out.println("ascending sorting arrar is : "+ab[i]);
		}
	
		
		

		
	}

}
