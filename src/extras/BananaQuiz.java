//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
String sum =JOptionPane.showInputDialog("Do you like bananas?");
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
if (sum.equals("No")) {
	JOptionPane.showMessageDialog(null, "You're crazy!");
}
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
if (sum.equals("Yes")) {
String num =	JOptionPane.showInputDialog("What's your favorite hobby?");
JOptionPane.showMessageDialog(null, num + "is so much better with bananas!");
}
else {
	JOptionPane.showMessageDialog(null, "You're BANANAS!!!!");
}
		//4. OPTIONAL: if they say something other than “yes” or “no”
		//	show a pop up that says “You are bananas!”

	}

}
