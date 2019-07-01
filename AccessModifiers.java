package tutorial.basic;

public class AccessModifiers {
	
	private int x;
	public int y;
	
	public static void main(String[] args) {
		
	}
	
	public void doSomethingPublic() {

	}

	//Private visibility means that this method can't be accessed anywhere other than inside of this class
	private void doSomethingPrivate() {

	}

	//Protected visibility means that this method can only be accessed inside of this package and 
	//subclasses of this class 
	protected void doSomethingProtected() {

	}

	//default visibility means that this method can only be accessed inside of this package 
	//subclasses can't access these
	void doSomething() {

	}
}
