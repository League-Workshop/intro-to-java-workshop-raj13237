package section2;

import org.jointheleague.graphical.robot.Robot;import com.sun.prism.paint.Color;

public class RobotSquare {
	public static void main(String[] args) {
		Robot r2d2= new Robot();
		r2d2.sparkle();
		r2d2.penDown();
		r2d2.setSpeed(500);
		for(int i=0; i<4; i++) {
			r2d2.move(100);
			r2d2.turn(90);;
		
		}
	}
}
