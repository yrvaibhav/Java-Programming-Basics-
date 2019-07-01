package tutorial.basic;

public class Person {
	String name;
	int age;
	
	public Person(String name) {
		this.name = name;
		System.out.println("Person class Created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void sayHelloto(Person person) {
		// TODO Auto-generated method stub
		System.out.println(getName() + " said hello to "+ person.getName());
	}
}
