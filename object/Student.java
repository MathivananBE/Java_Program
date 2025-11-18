package object;

public class Student {
	
	String name;
	int age;
	
	public void display() {
		System.out.println("Student Name : "+name);
		System.out.println("Student Age : "+age);
	}
	
	Student(){
		
	}
	
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.name="mathi";
		s.age=22;
		s.display();
		
		System.out.println("--------------------------------");
		
		Student s1=new Student("sanjay",21);
		s1.display();
	}

}
