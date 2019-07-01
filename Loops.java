package tutorial.basic;

public class Loops {
	public static void main(String[] args) {
		
		//whileLoop();
		//doWhileLoop();
		forLoop();
		}
	
	
	static void whileLoop() {
		int x = 0;
		System.out.println("While Loop");
		while(x < 10) {
			x ++;
			System.out.println(x);
		}
	}
	
	static void doWhileLoop() {
		int x = 10;
		System.out.println("Do While Loop");
		do {
			x ++;
			System.out.println(x);
		}while(x < 10);
	}
	
	static void forLoop() {
		System.out.println("For Loop");
		for(int x=0; x<10; x++ ) {
			System.out.println(x);
		}
	}
}
