package tutorial.basic;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Objects {
	public static void main(String[] args) {
		int x = 5;
		
		JFrame window = new JFrame();
		window.setTitle("My new Window");
		window.setSize(500, 400);
		window.setVisible(true);
		
		JLabel label = new JLabel();
		label.setText("My Lable");
		
		window.add(label);
		
		String s = "hai";
	}
}
