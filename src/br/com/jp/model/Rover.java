package br.com.jp.model;

import br.com.jp.model.state.RoverState;
import br.com.jp.model.state.factory.RoverStateFactory;

public class Rover {

	private Position position;
	private HeadingTo headingTo;
	
	private RoverState roverState;
	
	public Rover(Position initialPosition, HeadingTo headingTo)
	{
		this.position = initialPosition;
		this.setHeadingTo(headingTo);
	}
	
	public Position getPosition() {
		return position;
	}

	public HeadingTo getHeadingTo() {
		return headingTo;
	}
	
	public void spinLeft()
	{
		roverState.spinLeft(this);
	}
	
	public void spinRight()
	{
		roverState.spinRight(this);
	}
	
	public void moveForward()
	{
		roverState.moveForward(this);
	}
	
	public void moveToSouth()
	{
		position.decrementY();
	}
	
	public void moveToNorth()
	{
		position.incrementY();
	}
	
	public void moveToEast()
	{
		position.incrementX();
	}
	
	public void moveToWest()
	{
		position.decrementX();
	}

	public void setHeadingTo(HeadingTo headingTo) {
		this.headingTo = headingTo;
		roverState = RoverStateFactory.getRoverState(headingTo);
	}
	
	@Override
	public String toString() {
		return position.toString() + " " + headingTo.getAcronym();
	}

}
