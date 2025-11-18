package object;

public class RectangleAreaAndPerimeter {

	int length;
	int width;
	
	public void calculateArea() {
		System.out.println("RectangleArea : "+(length*width));
	}
	
	public void calculatePerimeter() {
		System.out.println("RectanglePerimeter : "+(2*(length+width)));
	}
	
	
	public static void main(String[] args) {
		 RectangleAreaAndPerimeter r=new RectangleAreaAndPerimeter();
		 r.length=10;
		 r.width=11;
		 
		 r.calculateArea();
		 r.calculatePerimeter();
		 
	}
	
}
