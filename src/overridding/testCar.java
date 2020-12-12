package overridding;

public class testCar {

	public static void main(String[] args) {
	
//when method is present in parent class as well as child class with the same name & same number of arguments is called method overridding 
	//parent class must be extends into child class	
		//has-a relationship(between interface and class)
BMW bm=new BMW();

//static polymorphism or compile-time polymorphism
bm.start();
bm.refuel();
bm.stop();
bm.theftsafety();
		

System.out.println("*********");
car c=new car();
c.refuel();
c.stop();
c.refuel();
c.start();

//child class object can be reffered by parent class refference variable--is called dynamic or runtime polymorphism

System.out.println("****dynamic or runtime polymorphism******");
car cp=new BMW();
cp.start();
cp.stop();
cp.refuel();



	}

}
