package br.com.jp.model.operations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.jp.model.HeadingTo;
import br.com.jp.model.Position;
import br.com.jp.model.Rover;

public class MoveForwardRoverOperationTest {

	private MoveForwardRoverOperation operation;
	
	private Position initialPosition;
	
	@Before
	public void setUp()
	{
		operation = new MoveForwardRoverOperation();
		initialPosition = new Position(2, 2);
	}
	
	
	@Test
	public void shouldMoveForwardHeadingToSouth() {
		
		Rover rover = new Rover(initialPosition, HeadingTo.SOUTH);
		operation.execute(rover);
		
		Assert.assertEquals(HeadingTo.SOUTH, rover.getHeadingTo());
		Assert.assertEquals(new Position(2, 1), rover.getPosition());
	}
	
	@Test
	public void shouldMoveForwardHeadingToNorth() {
		Rover rover = new Rover(initialPosition, HeadingTo.NORTH);
		operation.execute(rover);
		
		Assert.assertEquals(HeadingTo.NORTH, rover.getHeadingTo());
		Assert.assertEquals(new Position(2, 3), rover.getPosition());
	}
	
	@Test
	public void shouldMoveForwardHeadingToEast() {
		Rover rover = new Rover(initialPosition, HeadingTo.EAST);
		operation.execute(rover);
		
		Assert.assertEquals(HeadingTo.EAST, rover.getHeadingTo());
		Assert.assertEquals(new Position(3, 2), rover.getPosition());
	}
	
	@Test
	public void shouldMoveForwardHeadingToWest() {
		Rover rover = new Rover(initialPosition, HeadingTo.WEST);
		operation.execute(rover);
		
		Assert.assertEquals(HeadingTo.WEST, rover.getHeadingTo());
		Assert.assertEquals(new Position(1, 2), rover.getPosition());
	}

}
