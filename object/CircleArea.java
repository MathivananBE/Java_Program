package object;

public class CircleArea {
	int radious;
	
	public void circleArea() {
		double area=Math.PI*radious*radious;
		System.out.println("circleArea = "+area);
	}
	
	public static void main(String[] args) {
		CircleArea c=new CircleArea();
		c.radious=5;
		c.circleArea();
	}

}
