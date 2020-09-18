package javapractise;

public class intfrun implements ctraffic {

	public static void main(String[] args) {
		
		
		ctraffic a=new intfrun();
		a.greengo();
		a.redstop();

	}

	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		System.out.println("i am in greengo");
		
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("i am in redstop");
		
	}

}
