
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "August 25th";
		String dadsBirthday = "June 5th";
		String myBirthday = "July 15th";
		String brotherBirthday = "August 9th";
		// 2. Find out which birthday the user wants and and store their response in a variable
	String Frick = JOptionPane.showInputDialog("What birthday do you want?");
		// 3. Print out what the user typed
	 if (Frick.equals("Mom")) {
		System.out.println(momsBirthday);
		JOptionPane.showMessageDialog(null,momsBirthday);
	}
	 if (Frick.equals ("Dad")) {
			System.out.println(dadsBirthday);
			JOptionPane.showMessageDialog(null,dadsBirthday);

		} 
	 if (Frick.equals("Me")) {
			System.out.println(myBirthday);
			JOptionPane.showMessageDialog(null,myBirthday);
		
	 }
	 if (Frick.equals("Brother")) {
			System.out.println(brotherBirthday);
			JOptionPane.showMessageDialog(null,brotherBirthday);
		
	 }
	 else {
		System.out.println("Sorry, i don't remember that person's birthday!");
		JOptionPane.showMessageDialog(null,"Sorry, i don't remember that person's birthday!");
	}
	
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
