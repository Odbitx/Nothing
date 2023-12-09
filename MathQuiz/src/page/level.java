package page;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class level implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton backButton;
	JButton Beginner, Intermediate, Advanced;
	JButton[] function = new JButton[4];
	
	
	public level () {
		
		backButton = new JButton("Back");
		backButton.setFocusable(false);
		backButton.addActionListener(this);
		
		Beginner = new JButton("Beginner");
		Intermediate = new JButton("Intermediate");
		Advanced = new JButton("Advanced");
		Advanced.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		function[0] = Beginner;
		function[1] = Intermediate;
		function[2] = Advanced;
		
		
		for (int i = 0 ; i < 3; i++) {
			function[i].addActionListener(this);
			function[i].setFocusable(false);
		}
		
		backButton.setBounds(10, 30, 85, 21);
		Beginner.setBounds(121, 102, 145, 50);
		Intermediate.setBounds(121, 181, 145, 50);
		Advanced.setBounds(121, 262, 145, 50);
		
		frame.getContentPane().add(backButton);
		frame.getContentPane().add(Beginner);
		frame.getContentPane().add(Intermediate);
		frame.getContentPane().add(Advanced);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == backButton) {
			Operation operation = new Operation();
		} 
		
	}

}
