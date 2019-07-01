package game;

public abstract class GameObject {
	
	public abstract void draw();
	
	public static void main(String[] args) {
		Player player = new Player();
		player.draw();
		
		Menu menu = new Menu();
		menu.draw();
	}
}
