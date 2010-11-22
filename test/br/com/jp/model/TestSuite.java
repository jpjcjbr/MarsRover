package br.com.jp.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.jp.adapter.PlateauAdapterTest;
import br.com.jp.adapter.RoverAdapterTest;
import br.com.jp.model.caller.RoverCallerTest;
import br.com.jp.model.operations.MoveForwardRoverOperationTest;
import br.com.jp.model.operations.TurnLeftRoverOperationTest;
import br.com.jp.model.operations.TurnRightRoverOperationTest;
import br.com.jp.model.operations.factory.RoverOperationFactoryTest;
import br.com.jp.model.starter.RoverStarterTest;
import br.com.jp.model.state.HeadingToEastStateTest;
import br.com.jp.model.state.HeadingToNorthStateTest;
import br.com.jp.model.state.HeadingToSouthStateTest;
import br.com.jp.model.state.HeadingToWestStateTest;
import br.com.jp.model.state.factory.RoverStateFactoryTest;

@SuiteClasses({
	PositionTest.class,
	RoverTest.class,
	MoveForwardRoverOperationTest.class,
	TurnLeftRoverOperationTest.class,
	TurnRightRoverOperationTest.class,
	RoverOperationFactoryTest.class,
	RoverStateFactoryTest.class,
	HeadingToNorthStateTest.class,
	HeadingToSouthStateTest.class,
	HeadingToEastStateTest.class,
	HeadingToWestStateTest.class,
	RoverCallerTest.class,
	PlateauAdapterTest.class,
	RoverAdapterTest.class,
	RoverStarterTest.class
})
@RunWith(Suite.class)
public class TestSuite {

}
