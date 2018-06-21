package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		JOptionPane.showMessageDialog(null, "Welcome to Quiz Game!");
		JOptionPane.showConfirmDialog(null, "Are you ready to start?");
		int score = 0;
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("What is the capital of New York?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equalsIgnoreCase("Albany")) {
			score= score +1;
		}

		
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String answer2= JOptionPane.showInputDialog("What is the first element on the periodic table");
		if(answer2.equalsIgnoreCase("Hydrogen")) {
			score = score +1;
		}
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "Final score = " +score);
	}
}
