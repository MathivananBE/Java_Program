package java_8_features;

class DefaultMethodDriver {

	public static void main(String[] args) {
		
		DefaultMethod a=new DefaultMethod() {
			public void m3() {
				System.out.println("hi from m3....");
			}
			
		};
		
		a.m1();
		DefaultMethod.m2();
		a.m3();
	}
}
