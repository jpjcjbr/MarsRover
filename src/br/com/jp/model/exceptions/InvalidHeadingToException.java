package br.com.jp.model.exceptions;

public class InvalidHeadingToException extends RuntimeException {

	private static final long serialVersionUID = 1660256890386403900L;

	public InvalidHeadingToException() {
		super("Invalid heading option for rover");
	}
}
