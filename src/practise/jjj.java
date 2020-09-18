package practise;

public class jjj {

	
	public static void main (String []arg) {
		
 boolean flag=false;
int n=10;//needs to be check is a prime number is not 
int m=n/2;
    for (int i=2;i<m;i++){
    	
    	
    	if (n%i==0) {
         
    		flag =true;	
    		break;
    	           }
    }
    	if(flag) {
    		System.out.println(n+"is not a prime");
    	}
    	else {
    		System.out.println(n+"is a prime");
    	}
    		
		
		
		  }  
		} 