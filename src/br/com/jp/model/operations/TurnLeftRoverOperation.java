package br.com.jp.model.operations;

import br.com.jp.model.Rover;

public class TurnLeftRoverOperation implements RoverOperation{

	public void execute(Rover rover) {
		rover.spinLeft();
	}
}
