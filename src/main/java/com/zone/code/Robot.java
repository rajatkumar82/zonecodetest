package com.zone.code;

public class Robot {

	private int x;
	private int y;
	private String direction;
	private String coordinates;
	private TableTop tableTop = new TableTop();

	public Robot(final int x, final int y, final String direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getDirection() {
		return direction;
	}
	
	public String getCoordinates() {
		return getX() + "," + getY() + "," + getDirection();
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Robot move(final Robot robot) {
		if (robot.getDirection().equals("EAST")) {
			if (x++ == tableTop.getMAX()) {
				System.out.println("Cant move in this direction");
			} else {
				robot.setX(x++);
			}
		} else if (robot.getDirection().equals("WEST")) {
			if (x-- == tableTop.getMIN()) {
				System.out.println("Cant move in this direction");
			} else {
				robot.setX(x--);
			}
		} else if (robot.getDirection().equals("SOUTH")) {
			if (y-- == tableTop.getMIN()) {
				System.out.println("Cant move in this direction");
			} else {
				robot.setY(y--);
			}
		} else if (robot.getDirection().equals("NORTH")) {
			if (y++ == tableTop.getMAX()) {
				System.out.println("Cant move in this direction");
			} else {
				robot.setY(y++);
			}
		}
		return robot;
	}

	public void turn(final Robot robot, final String command) {
		if (command.equals("LEFT")) {
			switch (direction) {
			case "NORTH":
				robot.setDirection("WEST");
				break;
			case "WEST":
				robot.setDirection("SOUTH");
				break;
			case "SOUTH":
				robot.setDirection("EAST");
				break;
			case "EAST":
				robot.setDirection("NORTH");
				break;
			default:
				break;
			}
		} else if (command.equals("RIGHT")) {
			switch (direction) {
			case "NORTH":
				robot.setDirection("EAST");
				break;
			case "EAST":
				robot.setDirection("SOUTH");
				break;
			case "SOUTH":
				robot.setDirection("WEST");
				break;
			case "WEST":
				robot.setDirection("NORTH");
				break;
			default:
				break;
			}
		}
	}
}
