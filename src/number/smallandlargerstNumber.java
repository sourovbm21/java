package number;

public class smallandlargerstNumber {

	public static void main(String[] args) {
		

		int number[]= {-100,0,-10,24,50,-88,9878};
		int smalest=number[0];
		int largest=number[0];
		
		for (int i=1;i<number.length;i++) {
			
			if (number[i]<number[0]) {
				smalest=number[i];
				
			}else if(number[i]>largest) {
				largest =number[i];
			}
			
				
		}
		System.out.println("largest is : "+largest);
		System.out.println("smalest is : "+smalest);
		
		int x=200;
		int y=300;
		int  z=400;
		
		if(x>y&&x>z) {
			
				System.out.println(x+" x is a largest number  ");
			}else if(y>z) {
				System.out.println(y+" y is a largest number  ");
			}else
				System.out.println(z+" z is a largest number  ");
				
			
		}
		
		
	}


