package page;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import main.GamePanel;

public class startPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton Button = new JButton();
	JLabel label = new JLabel();
	
	
	public startPage() {
		
		
		Button.setBounds(150, 160, 100, 50);
		Button.setFocusCycleRoot(false);
		Button.addActionListener(this);
		Button.setText("Start");
		Button.setFocusable(false);
		
		frame.add(Button);
	
		GamePanel();
		
	}
	
	public void GamePanel() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== Button) {
			frame.dispose();
			Operation operation = new Operation();
		}
		
	}

}
