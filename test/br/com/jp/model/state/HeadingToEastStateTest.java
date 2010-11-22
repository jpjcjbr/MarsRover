package br.com.jp.model.state;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.jp.model.HeadingTo;
import br.com.jp.model.Position;
import br.com.jp.model.Rover;

public class HeadingToEastStateTest {

	private HeadingToEastState state;

	private Rover rover;
	
	private Position initialPosition;
	
	@Before
	public void setUp()
	{
		state = new HeadingToEastState();
		initialPosition = new Position(2, 2);
		rover = new Rover(initialPosition, HeadingTo.EAST);
	}

	@Test
	public void shouldSpinLeft() {
		state.spinLeft(rover);
		
		assertEquals(HeadingTo.NORTH, rover.getHeadingTo());
		assertEquals(initialPosition, rover.getPosition());
	}

	@Test
	public void shouldSpinRight() {
		state.spinRight(rover);
		
		assertEquals(HeadingTo.SOUTH, rover.getHeadingTo());
		assertEquals(initialPosition, rover.getPosition());
	}

	@Test
	public void shouldMoveForward() {
		state.moveForward(rover);
		
		Position expectedPosition = new Position(3, 2);
		
		assertEquals(HeadingTo.EAST, rover.getHeadingTo());
		assertEquals(expectedPosition, rover.getPosition());
	}

}
