package br.com.jp.model;

import br.com.jp.model.exceptions.InvalidHeadingToException;

public enum HeadingTo {

	NORTH('N'), EAST('E'), SOUTH('S'), WEST('W');
	
	private char acronym;
	
	private HeadingTo(char acronym)
	{
		this.acronym = acronym;
	}
	
	public static HeadingTo getHeadingToByAcronym(char acronym)
	{
		switch (acronym) {
		case 'N': return HeadingTo.NORTH;
		case 'E': return HeadingTo.EAST;
		case 'S': return HeadingTo.SOUTH;
		case 'W': return HeadingTo.WEST;

		default:
			throw new InvalidHeadingToException(); 
		}
	}

	public char getAcronym() {
		return acronym;
	}
}
