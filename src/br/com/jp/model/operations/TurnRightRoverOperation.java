package br.com.jp.model.operations;

import br.com.jp.model.Rover;

public class TurnRightRoverOperation implements RoverOperation{

	@Override
	public void execute(Rover rover) {
		rover.spinRight();
	}

}
