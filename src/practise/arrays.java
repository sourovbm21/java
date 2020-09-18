package practise;

public class arrays {

	public static void main(String[] args) {
		
		
		int a[]=new int[3];
		int a1[]={1,2,3};
		a[0]=1;
		a[1]=2;
		a[2]=3;
	
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			System.out.println(a1[i]);
			
		}

int arry[]= {3,4,2,6,7};
min(arry);
printArray(new int [] {10,2,3,4,6});
get();
  for (int i=0;i<a.length;i++) {
	  System.out.println("i am in get : "+a[i]);
  }

	}



	private static void min(int[] arry) {
	
		int min=arry[0];
		
		for (int i=0;i<arry.length;i++) {
			 
			if(min>arry[i]) {
				min=arry[i];
				System.out.println("min number of this array : "+min);
			}
			
		}
		
	}


  static void printArray(int arr[]) {
	  
	  for (int i=1;i<arr.length;i++) {
		  System.out.println(arr[i]);
	  }
	  
  }
  
   private static int  []get() {
	   return new int [] {2,3};
	
   }
  
}
