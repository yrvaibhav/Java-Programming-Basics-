package tutorial.basic;

public class TypeAndVariable {
	public static void main(String[] args) {
		int myVariable; //declaring variable called myVariable that stores the type int or integers 
		myVariable = 10; // initializing myVariable to the value 10
		
		System.out.println(myVariable);
		
		myVariable = 150;
		System.out.println(myVariable);
		
		myVariable =myVariable + 5;
		System.out.println(myVariable);
		
		int myVar2 = 50;
		System.out.println(myVariable + myVar2);
		
		double x = 9.25;
		System.out.println(x);
		
		String hello = "Hello, ";
		String name = "Vaibhav";
		System.out.println(hello + name); //string concatenation
	}
}
