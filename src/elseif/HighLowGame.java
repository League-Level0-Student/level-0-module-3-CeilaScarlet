//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		
		// 2. Print out the random variable above

		// 11. do the following 10 times
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
String Gob = JOptionPane.showInputDialog("Guess a number?");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
	int con=Integer.parseInt(Gob);	
	
	int random = new Random().nextInt(100);
	
	System.out.println(random);		
			// 5. if the guess is correct
				// 6. win
	if (con==random) {
		JOptionPane.showMessageDialog(null, "You won!!!!!!");
	}
			// 7. if the guess is high
				// 8. tell them it's too high
	if (con>random) {
		JOptionPane.showMessageDialog(null, "It's too high!!!!!!");
		JOptionPane.showMessageDialog(null, "You lost!!!!!!");
	}
			// 9. if the guess is low
				// 10. tell them it's too low
if (con<random) {
	JOptionPane.showMessageDialog(null, "It's too low!!!!!!");
	JOptionPane.showMessageDialog(null, "You lost!!!!!!");
}
		// 12. tell them they lose
	}

}


