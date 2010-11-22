package br.com.jp.model.exceptions;

public class InvalidRoverOperationException extends RuntimeException {

	private static final long serialVersionUID = 2247980983059590805L;

	public InvalidRoverOperationException() {
		super("Invalid Rover Operation. Should be 'L' or 'R' or 'M'.");
	}
}
