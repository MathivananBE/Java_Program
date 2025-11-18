package java_8_features;

public class LambdaExpression {

	public static void main(String[] args) {
		/*
		 * --------------Normal way--------------
		Functionalinterface a=new Functionalinterface() {
			public void m1() {
				System.out.println("hii from m1 method...");
			}
		};
		a.m1();
		*/
		//--------------------lambda way----------------
		Functionalinterface a=()-> System.out.println("hii from m1 method...");
		a.m1();		
	}
}
