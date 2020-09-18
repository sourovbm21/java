package abstructionProblemSolving;

public abstract class Shape {

	double dim1,dim2;
	Shape(double dim1,double dim2){
		this.dim1=dim1;
		this.dim2=dim2;
	}
	abstract void area();
	
}
