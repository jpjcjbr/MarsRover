package br.com.jp.model.state;

import br.com.jp.model.HeadingTo;
import br.com.jp.model.Rover;

public class HeadingToNorthState implements RoverState{

	@Override
	public void spinLeft(Rover rover) {
		rover.setHeadingTo(HeadingTo.WEST);
	}

	@Override
	public void spinRight(Rover rover) {
		rover.setHeadingTo(HeadingTo.EAST);
	}

	@Override
	public void moveForward(Rover rover) {
		rover.moveToNorth();
	}

}
