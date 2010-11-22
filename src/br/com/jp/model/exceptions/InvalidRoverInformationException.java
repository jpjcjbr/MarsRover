package br.com.jp.model.exceptions;

public class InvalidRoverInformationException extends RuntimeException {

	private static final long serialVersionUID = -3716144182090196424L;

	public InvalidRoverInformationException()
	{
		super("Invalid rover information. Should be [x] [y] [heading]");
	}
}
