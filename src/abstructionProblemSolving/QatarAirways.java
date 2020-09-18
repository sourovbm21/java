package abstructionProblemSolving;

public class QatarAirways extends ParentAirCraft {

	public static void main(String[] args) {
		

		QatarAirways qa=new QatarAirways();
		qa.engine();
		qa.safetyGuideLine();
		qa.bodyColour();

	}

	@Override
	public void bodyColour() {
		System.out.println("red colour on the body");
		
	}

}
