package quiz3;

public class Triangle extends GeometricObject {
	
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	/**
	 * no-arg constructor for default Triangle 
	 */
	public Triangle() {
		
	}
	/**
	 * Creates a triangle with specified side1, side2, and side3
	 * 
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}
	/**
	 * Accessor method for side1
	 * 
	 * @return
	 */
	public double getSide1() {
		return side1;
	}

	
	/**
	 * Accessor method for side2
	 * 
	 * @return
	 */
	public double getSide2() {
		return side2;
	}

	
	/**
	 * Accessor method for side3
	 * 
	 * @return
	 */
	public double getSide3() {
		return side3;
	}

	/**
	 * Returns the area of the triangle
	 */
	public double getArea(){
		return Math.pow((((side1 + side2 + side3)/2) * (((side1 + side2 + side3)/2) - side1) * 
				(((side1 + side2 + side3)/2) - side2) * (((side1 + side2 + side3)/2) - side3)), .5); 
		
	}
	/**
	 * returns the perimeter of the triangle
	 */
	public double getPerimeter(){
		return (side1 + side2 + side3);
	}
	/**
	 * returns a string description of the triangle
	 */
	public String toString(){
		return "Side 1 of the triangle is: " + side1 + "Side 2 of the triangle is: " + side2 + 
				"Side 3 of the triangle is: " + side3;
	}


	
}
