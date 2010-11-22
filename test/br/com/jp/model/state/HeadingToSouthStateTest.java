package br.com.jp.model.state;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.jp.model.HeadingTo;
import br.com.jp.model.Position;
import br.com.jp.model.Rover;

public class HeadingToSouthStateTest {

	private HeadingToSouthState state;
	
	private Rover rover;
	
	private Position initialPosition;
	
	@Before
	public void setUp()
	{
		state = new HeadingToSouthState();
		initialPosition = new Position(2, 2);
		rover = new Rover(initialPosition, HeadingTo.SOUTH);
	}

	@Test
	public void shouldSpinLeft() {
		state.spinLeft(rover);
		
		assertEquals(HeadingTo.EAST, rover.getHeadingTo());
		assertEquals(initialPosition, rover.getPosition());
	}

	@Test
	public void shouldSpinRight() {
		state.spinRight(rover);
		
		assertEquals(HeadingTo.WEST, rover.getHeadingTo());
		assertEquals(initialPosition, rover.getPosition());
	}

	@Test
	public void shouldMoveForward() {
		state.moveForward(rover);
		
		Position expectedPosition = new Position(2, 1);
		
		assertEquals(HeadingTo.SOUTH, rover.getHeadingTo());
		assertEquals(expectedPosition, rover.getPosition());
	}

}
