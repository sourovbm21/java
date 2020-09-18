package practise;

public class array {

	public static void main(String[] args) {
	
		
		char first[]= {'w', 'e', 'c', 'a', 'f', 'i', 'n', 'a', 't', 'e', 'd'};
		char second[]=new char[7];
		System.arraycopy(first, 2, second, 0, 7);
	System.out.println(String .valueOf(second));	
	
	
    //declaring a source array  
   char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
            'i', 'n', 'a', 't', 'e', 'd' };  
    //declaring a destination array  
    char[] copyTo = new char[7];  
    //copying array using System.arraycopy() method  
    System.arraycopy(copyFrom, 2, copyTo, 0, 7);  
    //printing the destination array  
    System.out.println(String.valueOf(copyTo));  
    
    int a[]= {2,3,4,5,6,7,8,9,0,1,2,3,4,11,12,13};
    int b[]=new int[5];
    
    System.arraycopy(a, 1, b, 1, 4);
   
    System.out.println( String.valueOf(b));
    
    //cloning of array 
    
    int t[]= {2,3,4,5,6,7,8,9};
    t.getClass().getName();
    System.out.println( t.getClass().getName());
    System.out.println("my main array");
    
    for(int i:t) {
    	System.out.println(i);
    }
    
    int r[]=t.clone();
    for(int i:r) {
    	System.out.println(i);
    }
 
    //coping 
    
    int arr[]=new int[] {2,3,4,5,6,7};
    int arra[]=new int[arr.length];
    
  
    
    for(int i=0;i<arr.length;i++) {
    	
    	System.out.println("my first arr ; "+arr[i]);
    }
  System.out.println("************");  
    for (int i=0;i<arr.length;i++) {
    	
    	arra[i]=arr[i];
        System.out.println("my second array : "+arra[i]);
    }
    //adding 2Darray 
    
    int A[][]= {{2,3,4,},{5,6,7,}};
    int B[][]= {{4,5,6,},{1,2,3}};
  
    int C[][]= new int[2][3]; 
    
    for (int i=0;i<2;i++) {
    	
    	for (int j=0;j<3;j++) {
    		
    		C[i][j]=A[i][j]+B[i][j];
    		System.out.print(C[i][j]+" ");
    	}
    	System.out.println();
    }
    
  //finding duplicate number from this array 
    
    int AB[]=new int [] {1,2,3,4,5,4,3,2,6,8,3};
    
    for (int i=0;i<AB.length;i++) {
    	
    	for (int j=i+1;j<AB.length;j++) {
    		
    		if (AB[i]==AB[j]) {
    			System.out.println(AB[i]);
    		}
    	}
    	
    }
    
    
    
    
    
    
    
    
    
    
}  


	}


