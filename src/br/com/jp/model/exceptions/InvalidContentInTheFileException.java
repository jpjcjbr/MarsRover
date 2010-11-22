package br.com.jp.model.exceptions;

public class InvalidContentInTheFileException extends RuntimeException {

	private static final long serialVersionUID = 9008476598286450938L;

	public InvalidContentInTheFileException()
	{
		super("Invalid information in the file. Maybe the file is empty.");
	}
}
