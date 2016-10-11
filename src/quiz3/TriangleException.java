package quiz3;

public class TriangleException extends Exception {
	
	private double Triangle;
	
	
	public TriangleException(double Triangle){
		
		this.Triangle = Triangle;
	}

	
	public double getTriangle(){
		
		return Triangle;
	}
}
