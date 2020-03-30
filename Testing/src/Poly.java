
public class Poly {
	public static void main(String[] args) {
	
		Parent p=new Child();
		p.child();
	
	
	}

}
class Parent{
	void child() {
		System.out.println("parent class");
	}
}
class Child extends Parent{
	void child() {
		System.out.println("Child class");
	}
}

