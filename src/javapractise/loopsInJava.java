package javapractise;

public class loopsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    String k="";
	//	for(int i=10;i>=10;i--) {
	//		System.out.println(i);
	//		k=k+i;
	//	}
	//	System.out.println(k);
	/*
		for(int i=0;i<100;i++) {
			System.out.println(i);
		}
		if(5==5) {
			System.out.println("i am in true");
		}else {
			System.out.println("i am in else ");
		}*/
		
		String s="java Application";
		for (int i=s.length()-1;i>=0;i--) {
			k=k+s.charAt(i);
		
		
		}
		System.out.println(k);
	}

}
