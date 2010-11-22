package br.com.jp.model.exceptions;

public class InvalidPlateauInformationException extends RuntimeException{

	private static final long serialVersionUID = -431189438085222978L;

	public InvalidPlateauInformationException()
	{
		super("Incorret plateau information. Should be [width] [height] in the first line of the file.");
	}
}
