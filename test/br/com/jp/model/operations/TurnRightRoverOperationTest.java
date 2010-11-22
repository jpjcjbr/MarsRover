package br.com.jp.model.operations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.jp.model.HeadingTo;
import br.com.jp.model.Position;
import br.com.jp.model.Rover;


public class TurnRightRoverOperationTest {

	private TurnRightRoverOperation operation;
	
	private Position initialPosition;
	
	@Before 
	public void setUp()
	{
		operation = new TurnRightRoverOperation();
		initialPosition = new Position(2, 2);
	}
	
	@Test
	public void shouldTurnRightFromSouth() {
		Rover rover = new Rover(initialPosition, HeadingTo.SOUTH);
		operation.execute(rover);
		
		Assert.assertEquals(HeadingTo.WEST, rover.getHeadingTo());
		Assert.assertEquals(initialPosition, rover.getPosition());
	}
	
	@Test
	public void shouldTurnRightFromNorth() {
		Rover rover = new Rover(initialPosition, HeadingTo.NORTH);
		operation.execute(rover);
		
		Assert.assertEquals(HeadingTo.EAST, rover.getHeadingTo());
		Assert.assertEquals(initialPosition, rover.getPosition());
	}
	
	@Test
	public void shouldTurnRightFromEast() {
		Rover rover = new Rover(initialPosition, HeadingTo.WEST);
		operation.execute(rover);
		
		Assert.assertEquals(HeadingTo.NORTH, rover.getHeadingTo());
		Assert.assertEquals(initialPosition, rover.getPosition());
	}
	
	@Test
	public void shouldTurnRightFromWest() {
		Rover rover = new Rover(initialPosition, HeadingTo.EAST);
		operation.execute(rover);
		
		Assert.assertEquals(HeadingTo.SOUTH, rover.getHeadingTo());
		Assert.assertEquals(initialPosition, rover.getPosition());
	}
	
}
