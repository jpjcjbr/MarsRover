package br.com.jp.model.operations.factory;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.jp.model.operations.MoveForwardRoverOperation;
import br.com.jp.model.operations.OperationType;
import br.com.jp.model.operations.RoverOperation;
import br.com.jp.model.operations.TurnLeftRoverOperation;
import br.com.jp.model.operations.TurnRightRoverOperation;

public class RoverOperationFactoryTest {

	@Test
	public void shouldReturnTurnLeftOperation() {
		RoverOperation roverOperation = RoverOperationFactory.getRoverOperation(OperationType.TURN_LEFT);
		assertTrue(roverOperation instanceof TurnLeftRoverOperation);
	}
	
	@Test
	public void shouldReturnTurnRightOperation() {
		RoverOperation roverOperation = RoverOperationFactory.getRoverOperation(OperationType.TURN_RIGHT);
		assertTrue(roverOperation instanceof TurnRightRoverOperation);
	}
	
	@Test
	public void shouldReturnMoveForwardOperation() {
		RoverOperation roverOperation = RoverOperationFactory.getRoverOperation(OperationType.MOVE_FORWARD);
		assertTrue(roverOperation instanceof MoveForwardRoverOperation);
	}

}
