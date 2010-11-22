package br.com.jp.model.operations.factory;

import br.com.jp.model.operations.MoveForwardRoverOperation;
import br.com.jp.model.operations.OperationType;
import br.com.jp.model.operations.RoverOperation;
import br.com.jp.model.operations.TurnLeftRoverOperation;
import br.com.jp.model.operations.TurnRightRoverOperation;

public class RoverOperationFactory {

	private static MoveForwardRoverOperation moveForwardRoverOperation = new  MoveForwardRoverOperation();
	
	private static TurnLeftRoverOperation turnLeftRoverOperation = new TurnLeftRoverOperation();
	
	private static TurnRightRoverOperation turnRightRoverOperation = new TurnRightRoverOperation();
	
	public static RoverOperation getRoverOperation(OperationType operation)
	{
		RoverOperation roverOperation = null;
		
		switch (operation) {
		case TURN_LEFT: 
			roverOperation = turnLeftRoverOperation;
			break;
		case TURN_RIGHT: 
			roverOperation = turnRightRoverOperation;
			break;
		case MOVE_FORWARD: 
			roverOperation = moveForwardRoverOperation;
			break;
		}
		
		return roverOperation;
	}
}
