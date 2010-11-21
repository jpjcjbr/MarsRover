package br.com.jp.model;

public class Rover {

	private Position position;
	private Direction direction;
	
	public Rover(Position initialPosition, Direction initialDirection)
	{
		this.position = initialPosition;
		this.direction = initialDirection;
	}
	
	public void move(char movementAcronym)
	{
		Command command = CommandFactory.getInstance().getCommand(movementAcronym);
		
		executeCommand(command);
	}
	
	private void executeCommand(Command command)
	{
		command.execute(this);
	}
}
