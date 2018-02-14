
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
Robot got= new Robot();
		//3. ask the user what color they would like the robot to draw
String color=	JOptionPane.showInputDialog("What color do you like the pen to be?");
		//4. use an if/else statement to set the pen color that the user requested
if (color.equals("red")) {
	got.setPenColor(Color.red);
} else if(color.equals("blue")) {
got.setPenColor(Color.blue);}



        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	    //1. make the robot draw a shape (this will take more than one line of code)
got.setX(200);
got.setY(200);
got.penDown();
got.setPenWidth(10);
got.setSpeed(10);
got.move(100);
got.turn(90);
got.move(100);
got.turn(90);
got.move(100);
got.turn(90);
got.move(100);
	}
}
