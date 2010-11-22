package br.com.jp.adapter;

import br.com.jp.model.HeadingTo;
import br.com.jp.model.Position;
import br.com.jp.model.Rover;
import br.com.jp.model.exceptions.InvalidRoverInformationException;

public class RoverAdapter {

	public Rover adaptStringToRover(String roverStr)
	{
		Rover rover = null;
		
		try
		{
			String[] roverInformation = roverStr.split("\\s");
			
			int x = Integer.parseInt(roverInformation[0]);
			int y = Integer.parseInt(roverInformation[1]);
			char headingTo = roverInformation[2].charAt(0);
					
			rover = new Rover(new Position(x, y), HeadingTo.getHeadingToByAcronym(headingTo));
		}
		catch(Exception e)
		{
			throw new InvalidRoverInformationException();
		}
		
		return rover;
	}
}
