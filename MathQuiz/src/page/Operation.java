package page;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import Addition.addition;
import Division.division;
import Multiplication.multiplication;
import Subtraction.subtraction;

public class Operation implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton backButton = new JButton();
	JButton Addition, Subtraction, Multiplication, Division;
	JButton[] function = new JButton[4];
	
	Operation (){
		
		backButton = new JButton("Back");
		backButton.setFocusable(false);
		backButton.addActionListener(this);

		Addition = new JButton("Addition");
		Subtraction = new JButton("Subtraction");
		Multiplication = new JButton("Multiplication");
		Division = new JButton("Division");
		Division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		function[0] = Addition;
		function[1] = Subtraction;
		function[2] = Multiplication;
		function[3] = Division;
		
		for (int i = 0 ; i < 4; i++) {
			function[i].addActionListener(this);
			function[i].setFocusable(false);
		}
		
		backButton.setBounds(10, 30, 85, 21);
		Addition.setBounds(132, 58, 145, 50);
		Subtraction.setBounds(132, 124, 145, 50);
		Multiplication.setBounds(132, 184, 145, 50);
		Division.setBounds(132, 244, 145, 50);
		
		frame.getContentPane().add(backButton);
		frame.getContentPane().add(Addition);
		frame.getContentPane().add(Subtraction);
		frame.getContentPane().add(Multiplication);
		frame.getContentPane().add(Division);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.getContentPane().setLayout(null);
		
		
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		if (e.getSource() == backButton) {
			startPage start = new startPage();
		} else if (e.getSource() == Addition) {
			frame.dispose();
			addition Addition = new addition();
		} else if (e.getSource() == Subtraction) {
			frame.dispose();
			subtraction Subtraction = new subtraction();
		} else if (e.getSource() == Multiplication) {
			frame.dispose();
			multiplication Multiplication = new multiplication();
		} else if (e.getSource() == Division ) {
			frame.dispose();
			division Division = new division();
		}
		
	}
}

