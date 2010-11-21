package br.com.jp.model;

public enum Direction {

	NORTH('N'), EAST('E'), SOUTH('S'), WEST('W');
	
	private char acronym;
	
	private Direction(char acronym)
	{
		this.acronym = acronym;
	}

	public char getAcronym() {
		return acronym;
	}
}
