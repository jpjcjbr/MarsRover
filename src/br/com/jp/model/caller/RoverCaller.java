package br.com.jp.model.caller;

import br.com.jp.model.Rover;
import br.com.jp.model.operations.OperationType;
import br.com.jp.model.operations.RoverOperation;
import br.com.jp.model.operations.factory.RoverOperationFactory;

public class RoverCaller {

	public void call(Rover rover, String commands) {
		for(int i = 0; i < commands.length(); i++)
		{
			char command = commands.charAt(i);
			
			OperationType operationType = OperationType.getOperationByAcronym(command);
			
			RoverOperation roverOperation = RoverOperationFactory.getRoverOperation(operationType);
			
			roverOperation.execute(rover);
		}
	}

}
