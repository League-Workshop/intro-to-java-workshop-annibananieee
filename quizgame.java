import javax.swing.JOptionPane;

public class quizgame {
	public static void main(String[] args) {
	// 1.  Create a variable to hold the user's score 
	int score=0;
			// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("is blue a color?");
			// 3.  Use an if statement to check if their answer is correct
			if(answer.equals("yes")) {
			// 4.  if the user's answer was correct, add one to their score 
				score = score + 1;
			 }
			//System.out.println(score);
			JOptionPane.showMessageDialog(null, score);
			// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
			 answer = JOptionPane.showInputDialog("is water a liquid?");
			 if(answer.equals("yes")) {
				score = score + 1;
			 }
			 answer = JOptionPane.showInputDialog("what is your favororite tv show?");
			 if(answer.equals("rick and morty")) {
				score = score + 1;
			 }
			 System.out.println(score);
			// 6.  After all the questions have been asked, print the user's score 
			
	}
}
