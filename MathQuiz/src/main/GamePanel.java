package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GamePanel {
	
	JFrame frame = new JFrame();
	JButton Button = new JButton();
	JLabel label = new JLabel();
	
	public GamePanel() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
