package object;

public class Calculator {
	public int add(int a,int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
	
	public int mul(int a,int b) {
		return a*b;
	}
	
	public int div(int a,int b) {
		return a/b;
	}
	
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println("Add "+c.add(4, 3));
		System.out.println("Sub "+c.sub(5, 3));
		System.out.println("Mul "+c.mul(5, 5));
		System.out.println("div "+c.div(4, 2));
		
	}

}
