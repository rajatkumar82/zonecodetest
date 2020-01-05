package com.zone.code;

import junit.framework.TestCase;

import com.zone.code.Robot;

public class AppTest extends TestCase
{
	public void testNegativeX() {
		Robot robot = new Robot(0, 0, "WEST");
		robot.move(robot);
		assertEquals(-1, robot.getX());
    }
	
	public void testNegativeY() {
		Robot robot = new Robot(0, 0, "SOUTH");
		robot.move(robot);
		assertEquals(-1, robot.getY());
    }
	
	public void testMaxY() {
		Robot robot = new Robot(50, 50, "NORTH");
		robot.move(robot);
		assertEquals(51, robot.getY());
	}
	
	public void testMaxX() {
		Robot robot = new Robot(50, 50, "EAST");
		robot.move(robot);
		assertEquals(51, robot.getX());
	}
	
	public void testSampleFromTechTest1() {
		Robot robot = new Robot(0, 0, "NORTH");
		robot.move(robot);
		assertEquals("0,1,NORTH", robot.getCoordinates());
	}
	
	public void testSampleFromTechTest2() {
		Robot robot = new Robot(0, 0, "NORTH");
		robot.turn(robot, "LEFT");
		assertEquals("0,0,WEST", robot.getCoordinates());
	}
	
	public void testSampleFromTechTest3() {
		Robot robot = new Robot(1, 2, "EAST");
		robot.move(robot);
		robot.move(robot);
		robot.turn(robot, "LEFT");
		robot.move(robot);
		assertEquals("3,3,NORTH", robot.getCoordinates());
	}
}
