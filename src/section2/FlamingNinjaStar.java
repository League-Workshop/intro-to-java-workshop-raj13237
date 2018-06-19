package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;



public class FlamingNinjaStar {
	
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms
		
		// 1. Make a new robot, and set it's pen down.
		Robot r2d2 = new Robot();
		r2d2.penDown();
		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		r2d2.setX(400);
		r2d2.setY(400);
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 12. Set the robot speed to 10
		r2d2.setSpeed(10);
		// 13. Use a for loop to repeat all of the code below 25 times
		for(int i =0; i<25; i++) {
			r2d2.setPenColor(Color.YELLOW);
			r2d2.turn(1/8);
			r2d2.move(64);
			r2d2.turn(-40);
			r2d2.move(flameSize);
			r2d2.turn(170);
			r2d2.move(flameSize);
			r2d2.turn(64);
			r2d2.setPenColor(Color.black);
			r2d2.move(baseSize);
			
		}
			// 2. Turn the robot 1/8 of a circle
			
			// 3. Move the robot 64 pixels

			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
			
			// 5. Move the robot the distance in the variable flameSize
			
			// 6. Turn the robot 170 degrees
			
			// 7. Move the robot the distance in the variable flameSize (again)
			
			// 8. Turn the robot 64 degrees to the right
			
			// 9. Move the robot the distance in the variable baseSize
			
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			
			// 11. Color your ninja star like Figure 2.
		
	}

}


