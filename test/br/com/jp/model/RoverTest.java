package br.com.jp.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RoverTest {

	private Rover rover;
	
	private Position initialPosition;
	
	@Before
	public void setUp()
	{
		int x = 5;
		int y = 3;
		
		initialPosition = new Position(x, y);
		
		rover = new Rover(initialPosition, HeadingTo.SOUTH);
	}
	
	@Test
	public void shouldCreateRoverWithValues() {
		Assert.assertEquals(rover.getPosition(), initialPosition);
		Assert.assertEquals(rover.getHeadingTo(), HeadingTo.SOUTH);
	}
	
	@Test
	public void shouldSpinLeft()
	{
		rover.spinLeft();
		Assert.assertEquals(initialPosition, rover.getPosition());
		Assert.assertEquals(HeadingTo.EAST, rover.getHeadingTo());
	}
	
	@Test
	public void shouldSpinRight()
	{
		rover.spinRight();
		Assert.assertEquals(initialPosition, rover.getPosition());
		Assert.assertEquals(HeadingTo.WEST, rover.getHeadingTo());
	}
	
	@Test
	public void shouldMoveForward()
	{
		int yAfterMove = initialPosition.getY() - 1;
		
		Position newPosition = new Position(initialPosition.getX(), yAfterMove);
		
		rover.moveForward();
		
		Assert.assertEquals(newPosition, rover.getPosition());
		Assert.assertEquals(HeadingTo.SOUTH, rover.getHeadingTo());
	}
	
}
