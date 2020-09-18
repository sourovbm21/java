package abstructionProblemSolving;

public class Triangle extends Shape {

	
	Triangle(double dim1, double dim2) {
		super(dim1, dim2);
		// TODO Auto-generated constructor stub
	}

	@Override
	void area() {
		double result=0.5*dim1*dim2;
		System.out.println(" Triangle area :"+result);
		
		
}
}