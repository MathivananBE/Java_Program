package java_8_features;

public interface DefaultMethod {

	default void m1() {
		System.out.println("Hi from Default method....");
	}
	
	static void m2() {
		System.out.println("hi from static method....");
	}
	
	void m3();
}


