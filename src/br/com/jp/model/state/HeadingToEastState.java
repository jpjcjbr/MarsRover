package br.com.jp.model.state;

import br.com.jp.model.HeadingTo;
import br.com.jp.model.Rover;

public class HeadingToEastState implements RoverState{

	@Override
	public void spinLeft(Rover rover) {
		rover.setHeadingTo(HeadingTo.NORTH);
	}

	@Override
	public void spinRight(Rover rover) {
		rover.setHeadingTo(HeadingTo.SOUTH);
	}

	@Override
	public void moveForward(Rover rover) {
		rover.moveToEast();
	}

}
