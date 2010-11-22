package br.com.jp.model.state;

import br.com.jp.model.Rover;

public interface RoverState {

	void spinLeft(Rover rover);
	
	void spinRight(Rover rover);
	
	void moveForward(Rover rover);
}
