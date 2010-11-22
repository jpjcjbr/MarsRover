package br.com.jp.model.state.factory;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.jp.model.HeadingTo;
import br.com.jp.model.state.HeadingToEastState;
import br.com.jp.model.state.HeadingToNorthState;
import br.com.jp.model.state.HeadingToSouthState;
import br.com.jp.model.state.HeadingToWestState;
import br.com.jp.model.state.RoverState;

public class RoverStateFactoryTest {

	@Test
	public void shouldReturnHeadingToSouthState() {
		RoverState roverState = RoverStateFactory.getRoverState(HeadingTo.SOUTH);
		assertTrue(roverState instanceof HeadingToSouthState);
	}
	
	@Test
	public void shouldReturnHeadingToNorthState() {
		RoverState roverState = RoverStateFactory.getRoverState(HeadingTo.NORTH);
		assertTrue(roverState instanceof HeadingToNorthState);
	}
	
	@Test
	public void shouldReturnHeadingToEastState() {
		RoverState roverState = RoverStateFactory.getRoverState(HeadingTo.EAST);
		assertTrue(roverState instanceof HeadingToEastState);
	}
	
	@Test
	public void shouldReturnHeadingToWestState() {
		RoverState roverState = RoverStateFactory.getRoverState(HeadingTo.WEST);
		assertTrue(roverState instanceof HeadingToWestState);
	}

}
