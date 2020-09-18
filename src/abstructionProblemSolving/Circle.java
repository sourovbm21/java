package abstructionProblemSolving;

public class Circle extends Shape{

	
	Circle(double dim1, double dim2) {
		super(dim1, dim2);
		// TODO Auto-generated constructor stub
	}

	@Override
	void area() {
		double result=dim1*dim2;
		System.out.println(" Circle area :"+result);
		
		
}
}