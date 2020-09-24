package practise;

public class missingNumberArray {

	public static void main(String[] args) {
		

		int a[]= {-1,0,1,2,4,5,6,7,8,9,10,11,12,13,14,15,16};
		System.out.println(a.length);
		int asum=0;
		
		int bsum=0;
		
		
		for (int i=0;i<a.length;i++) {
			asum=asum+a[i];
		}
		System.out.println(asum);
		
		for (int k=-1;k<=16;k++) {
			bsum=bsum+k;
		}
		System.out.println(bsum);
		System.out.println("missing number is : "+(bsum-asum));
		
		
	}

}
