package br.com.jp.model.caller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.jp.model.HeadingTo;
import br.com.jp.model.Position;
import br.com.jp.model.Rover;
import br.com.jp.model.exceptions.InvalidRoverOperationException;

public class RoverCallerTest {

	private RoverCaller roverCaller;
	
	@Before
	public void setUp(){
		roverCaller = new RoverCaller();
	}
	
	@Test
	public void shouldMoveCorrectly1() {
		Rover rover = new Rover(new Position(1, 2), HeadingTo.NORTH);
		
		roverCaller.call(rover, "LMLMLMLMM");
		
		Assert.assertEquals(HeadingTo.NORTH, rover.getHeadingTo());
		Assert.assertEquals(new Position(1, 3), rover.getPosition());
	}
	
	@Test
	public void shouldMoveCorrectly2() {
		Rover rover = new Rover(new Position(3, 3), HeadingTo.EAST);
		
		roverCaller.call(rover, "MMRMMRMRRM");
		
		Assert.assertEquals(HeadingTo.EAST, rover.getHeadingTo());
		Assert.assertEquals(new Position(5, 1), rover.getPosition());
	}
	
	@Test
	public void shouldMoveCorrectly3() {
		Rover rover = new Rover(new Position(0, 0), HeadingTo.NORTH);
		
		roverCaller.call(rover, "MMMMMMM");
		
		Assert.assertEquals(HeadingTo.NORTH, rover.getHeadingTo());
		Assert.assertEquals(new Position(0, 7), rover.getPosition());
	}
	
	@Test
	public void shouldMoveCorrectly4() {
		Rover rover = new Rover(new Position(0, 0), HeadingTo.NORTH);
		
		roverCaller.call(rover, "LLLLRRRRLRLRLRMMMM");
		
		Assert.assertEquals(HeadingTo.NORTH, rover.getHeadingTo());
		Assert.assertEquals(new Position(0, 4), rover.getPosition());
	}
	
	@Test(expected = InvalidRoverOperationException.class)
	public void shouldNotMoveCorrectly1() {
		Rover rover = new Rover(new Position(0, 0), HeadingTo.NORTH);
		
		roverCaller.call(rover, "LLLLRRARRLRLRLRMMMM");
	}
}
