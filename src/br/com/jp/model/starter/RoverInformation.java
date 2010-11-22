package br.com.jp.model.starter;

public class RoverInformation {

	private String position;
	
	private String commands;

	public RoverInformation(String position, String commands) {
		super();
		this.position = position;
		this.commands = commands;
	}

	public String getPosition() {
		return position;
	}

	public String getCommands() {
		return commands;
	}
	
}
