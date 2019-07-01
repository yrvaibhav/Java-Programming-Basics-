package tutorial.basic;

public class Scope {
	static int x;
	public static void main(String[] args) {
		x = 5;
		System.out.println(x);
		doSomething();
		System.out.println(x);
		doSomethingLocally();
	}
	
	static void doSomething() {
		x=10;
	}
	
	static void doSomethingLocally() {
		int y=10;
		int z = x * y;
		System.out.println(z);
	}
}
