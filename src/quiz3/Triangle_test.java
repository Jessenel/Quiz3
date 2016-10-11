package quiz3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Triangle_test {

	@Test
	public void test_Area() {
		Triangle triangle = new Triangle (3.0, 4.0, 5.0);
		
		System.out.println("The area of the triangle is: " + triangle.getArea());


		
	}
	
	@Test
	public void test_Perimeter() {
		Triangle triangle = new Triangle (3.0, 4.0, 5.0);
		
		System.out.println("The perimeter of the triangle is: " + triangle.getPerimeter());


		
	}
	
	@Test
	public void test_ImaginaryTriangle(){
		
		Triangle triangle = new Triangle (100.0, -5.0, 1.0);
		
		System.out.println("The area of the triangle is: " + triangle.getArea() );
	}
		

}
