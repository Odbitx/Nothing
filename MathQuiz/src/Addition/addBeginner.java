package Addition;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import main.GamePanel;

public class addBeginner {
	String[] questions = {
			"2 + 3 = ?",
            "7 + 8 = ?",
            "5 + 9 = ?",
            "4 + 6 = ?",
            "3 + 2 = ?",
            "8 + 1 = ?",
            "6 + 5 = ?",
            "9 + 4 = ?",
            "2 + 7 = ?",
            "1 + 6 = ?"
						};
    String[][] options = {
    		 {"4", "5", "6", "7"},
             {"13", "15", "16", "17"},
             {"12", "14", "16", "18"},
             {"8", "10", "12", "14"},
             {"4", "5", "6", "7"},
             {"7", "8", "9", "10"},
             {"10", "11", "12", "13"},
             {"11", "12", "13", "14"},
             {"8", "9", "10", "11"},
             {"5", "6", "7", "8"}
						};
    char[] answers = {
    		'B',
    		'B',
    		'C',
    		'A',
    		'B',
    		'B',
    		'A',
    		'B',
    		'D',
    		'B'
    					};
    
    char guess, answer;
    int index;
    int correctGuesses = 0; 
    int totalQues = questions.length;
    int result;
    int timer = 15;
    
    
    JFrame frame = new JFrame();
    JTextField textField = new JTextField();
    JTextArea textArea = new JTextArea();
    JButton buttonA, buttonB, buttonC, buttonD;
    JLabel answerA, answerB, answerC, answerD;
    JLabel time, seconds;
    
    JTextField number = new JTextField();
    JTextField percentage = new JTextField();
    
    addBeginner() {
		
    	buttonA = new JButton();
    	buttonB = new JButton();
    	buttonC = new JButton();
    	buttonD = new JButton();
    	
    	answerA = new JLabel();
    	answerB = new JLabel();
    	answerC = new JLabel();
    	answerD = new JLabel();
    	
    	time = new JLabel();
    	seconds = new JLabel();
    	
    	GamePanel gamepanel = new GamePanel();
	}
}
