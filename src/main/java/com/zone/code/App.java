package com.zone.code;

import java.util.Scanner;

import com.zone.code.Robot;

public class App 
{
	private void printRobotCoordinates(final Robot robot) {
		System.out.println(String.format("%d, %d, %s", robot.getX(), robot.getY(), robot.getDirection()));
	}
	
	public static void main( String[] args )
    {
		App app = new App();
    	Robot robot = new Robot(0,0,"WEST");
    	
    	while (true) {
    		Scanner scanner = new Scanner(System.in);
    		while (scanner.hasNext()) {
    			String command = scanner.next();
    			switch(command) {
    			case "PLACE":
    				int x = scanner.nextInt();
    				int y = scanner.nextInt();
    				String direction = scanner.next();
    				robot.setX(x);
    				robot.setY(y);
    				robot.setDirection(direction);
    				break;
    			case "REPORT":
    				app.printRobotCoordinates(robot);
    				break;
    			case "MOVE":
    				robot.move(robot);
    				break;
    			case "LEFT":
    				robot.turn(robot, "LEFT");
    				break;
    			case "RIGHT":
    				robot.turn(robot, "RIGHT");
    				break;
    			}
    		}
    		scanner.close();
    	}
    }
}
