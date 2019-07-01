package tutorial.basic;
import javax.swing.JFrame;

public class ClassesAndObjects {
	public static void main(String[] args) {
		JFrame label = new JFrame();
		
		Person john = new Person("John");
		john.setAge(20);
		Person bob = new Person("Bob");
		bob.setAge(25);
		
		john.sayHelloto(bob);
		bob.sayHelloto(john);
		System.out.println(john.getName()+" is " + john.age + " years old");
		System.out.println(bob.getName()+" is " + bob.age + " years old");
	}
}
