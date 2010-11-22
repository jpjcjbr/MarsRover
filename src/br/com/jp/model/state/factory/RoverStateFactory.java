package br.com.jp.model.state.factory;

import br.com.jp.model.HeadingTo;
import br.com.jp.model.state.HeadingToEastState;
import br.com.jp.model.state.HeadingToNorthState;
import br.com.jp.model.state.HeadingToSouthState;
import br.com.jp.model.state.HeadingToWestState;
import br.com.jp.model.state.RoverState;

public class RoverStateFactory {

	private static HeadingToEastState headingToEastState = new HeadingToEastState();
	private static HeadingToWestState headingToWestState = new HeadingToWestState();
	private static HeadingToSouthState headingToSouthState = new HeadingToSouthState();
	private static HeadingToNorthState headingToNorthState = new HeadingToNorthState();
	
	public static RoverState getRoverState(HeadingTo headingTo)
	{
		RoverState roverState = null;
		
		switch (headingTo) {
		case EAST: 
			roverState = headingToEastState; 
			break;
		case NORTH:
			roverState = headingToNorthState; 
			break;
		case SOUTH:
			roverState = headingToSouthState; 
			break;
		case WEST:
			roverState = headingToWestState; 
			break;
		}
		
		return roverState; 
	}
}
