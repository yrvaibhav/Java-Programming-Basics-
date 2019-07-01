package tutorial.basic;

public class Methods {
	public static void main(String[] args) {
		sayHelloWorld();
		
		sayHelloTo("Vaibhav");
		
		int x = returnFive();
		
		System.out.println(x);
		
		int result = square(returnFive());
		System.out.println(result);
	}
	
	static int square(int x) {
		return x*x;
	}
	static int returnFive() {
		return 5;
	}
	
	static void sayHelloTo(String name) {
		System.out.println("Hello, " + name);
	}
	
	static void sayHelloWorld() {
		System.out.println("Hello World !!");
	}
}
