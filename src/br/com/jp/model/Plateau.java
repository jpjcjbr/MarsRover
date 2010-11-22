package br.com.jp.model;

import br.com.jp.model.exceptions.InvalidPlateauInformationException;

public class Plateau {

	private int width;
	private int height;
	
	public Plateau(int width, int height)
	{
		if(width <= 0 || height <= 0)
		{
			throw new InvalidPlateauInformationException();
		}
		
		this.width = width;
		this.height = height;
	}

	public boolean contains(Position position) {
		
		boolean isXValid = position.getX() >= 0 && position.getX() <= width;
		boolean isYValid = position.getY() >= 0 && position.getY() <= height;
		
		return isXValid && isYValid;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
