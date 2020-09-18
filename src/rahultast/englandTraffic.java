package rahultast;

public class englandTraffic implements CentralTraffic{

	public static void main(String[] args) {
		


		CentralTraffic	ct=new englandTraffic();
		ct.greenGo();
       englandTraffic et=new englandTraffic();
       et.walkOnSymbol();

	}

	@Override
	public void greenGo() {
		
		System.out.println("please go now");
		
	}

	public void walkOnSymbol() {
		System.out.println("please walk on showing this symbol");
	}
	@Override
	public void redStop() {
		System.out.println("please now stop driving");
		
	}

	@Override
	public void FlashYellow() {
		System.out.println("you can go but ready to stop");
		
	}

}
