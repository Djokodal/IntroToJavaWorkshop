package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot Jeff = new Robot();
	
	void go() {
		drawTriangle(50); // 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible
		Jeff.setSpeed(10);
		// 4. make a variable to hold the length of the triangle and set it to 50
		int trianglelength = 50;
		// 7. Do the following (up to step 10) 60 times
		for ( trianglelength = 0; trianglelength < 200; trianglelength++){
			// 9. Change the color of the pen to a random color
			Jeff.setRandomPenColor();
			// 8. Increase the length of the side by 10 pixels
				trianglelength = trianglelength + 10;
			// 5. call your drawTriangle() method using your length variable
	
			// 10. Turn the tortoise 6 degrees to the right
			Jeff.turn(6);
		}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		for(int i=0; i < 3; i++)
			Jeff.move(length);
			Jeff.turn(360/3);
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
