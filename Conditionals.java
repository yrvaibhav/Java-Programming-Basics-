package tutorial.basic;

public class Conditionals {
	public static void main(String[] args) {
		
		boolean sayHello = false;
		
		if(sayHello) {
			System.out.println("Hello");
		}else {
			System.out.println("GoodBye");
		}
		
		
		int playerX=50;
		
		if (true && false) {
			System.out.println("AND executed");
		}
		
		if (playerX<0 || playerX>800) {
			//some code to reverse our players direction
			System.out.println("OR executed");
		}
	}
}
