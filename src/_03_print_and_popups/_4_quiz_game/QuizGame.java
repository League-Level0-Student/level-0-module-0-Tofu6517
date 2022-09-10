package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
	int score=0;
			
		// ASK A QUESTION AND CHECK THE ANSWER
	String input = JOptionPane.showInputDialog("waffles or pancakes");
				// 2.  Ask the user a question 
		if(input.equals("both")){
			score=score+1;
			
			// 3.  Use an if statement to check if their answer is correct
		}
		String input1 = JOptionPane.showInputDialog("dogs or cats");
		// 2.  Ask the user a question 
if(input1.equals("both")){
	score=score+1;
	JOptionPane.showMessageDialog(null,score);
	// 3.  Use an if statement to check if their answer is correct
}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
